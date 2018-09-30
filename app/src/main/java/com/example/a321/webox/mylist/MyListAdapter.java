package com.example.a321.webox.mylist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.a321.webox.R;

import java.util.List;

public class MyListAdapter extends BaseAdapter {

    private List<MyListBean> data;
    private Context context;

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
            viewHolder.tv = convertView.findViewById(R.id.tv_my_list_item);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.tv.setText("内容未定占位" + position);
        return convertView;
    }

    private class ViewHolder{
        TextView tv;
    }
}
