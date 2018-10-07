package com.example.a321.webox.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a321.webox.R;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

import static com.example.a321.webox.R.id.iv_gridView_my_list_item;

public class MyListAdapter extends BaseAdapter {

    private List<MyListBean> data;
    private Context context;
    private SimpleAdapter simpleAdapter;

    public MyListAdapter(Context context,List<MyListBean> data){
        this.data = data;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_my_list,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.tv_id = convertView.findViewById(R.id.tv_id_my_list_item);
            viewHolder.gv = convertView.findViewById(R.id.gv_my_list_item);
            viewHolder.tv_message = convertView.findViewById(R.id.tv_message_my_list_item);
            viewHolder.tv_time = convertView.findViewById(R.id.tv_time_my_list_item);
            viewHolder.tv_delete = convertView.findViewById(R.id.tv_delete_my_list_item);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        simpleAdapter = new SimpleAdapter(convertView.getContext(),data.get(position).getList(),R.layout.gridview_item_my_list,new String[]{"img"},new int[]{R.id.iv_gridView_my_list_item});

        viewHolder.gv.setAdapter(simpleAdapter);
        setGridViewHeightBasedOnChildren(viewHolder.gv);
        viewHolder.tv_id.setText(data.get(position).getId());
        viewHolder.tv_message.setText(data.get(position).getMessage());
        viewHolder.tv_time.setText(data.get(position).getTime());
        viewHolder.tv_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you select delete",Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }

    //计算GridView高度
    public void setGridViewHeightBasedOnChildren(GridView gridView){
        ListAdapter listAdapter = gridView.getAdapter();
        if(listAdapter == null){
            return;
        }
        int rows;
        int columns = 0;
        int horizontalBorderHeight = 0;
        Class<?> clazz = gridView.getClass();
        Field column = null;
        try {
            column = clazz.getDeclaredField("mRequestedNumColumns");
            column.setAccessible(true);
            columns = (Integer) column.get(gridView);
            Field horizontalSpacing = clazz.getDeclaredField("mRequestedHorizontalSpacing");
            horizontalSpacing.setAccessible(true);
            horizontalBorderHeight = (Integer) horizontalSpacing.get(gridView);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        if(listAdapter.getCount() % columns > 0){
            rows = listAdapter.getCount() / columns + 1;
        }else {
            rows = listAdapter.getCount() / columns;
        }
        int totalHeight = 0;
        for(int i = 0;  i < rows; i++ ){
            View listItem = listAdapter.getView(i, null, gridView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = gridView.getLayoutParams();
        params.height = totalHeight + horizontalBorderHeight * (rows - 1);
        gridView.setLayoutParams(params);

    }

    private class ViewHolder{
        TextView tv_id;
        GridView gv;
        TextView tv_message;
        TextView tv_time;
        TextView tv_delete;

    }
}
