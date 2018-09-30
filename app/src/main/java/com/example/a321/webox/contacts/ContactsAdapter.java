package com.example.a321.webox.contacts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.a321.webox.R;

import java.util.List;

public class ContactsAdapter extends BaseAdapter {

    private Context context;
    private List<ContactsBean> data;

    public ContactsAdapter(Context context, List<ContactsBean> data){
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
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if( convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_contacts,parent,false);
            viewHolder = new ViewHolder();

            viewHolder.iv_contacts = convertView.findViewById(R.id.iv_userImg_item_contacts);
            viewHolder.tv_userId = convertView.findViewById(R.id.tv_userId_item_contacts);
            viewHolder.ll_contacts = convertView.findViewById(R.id.ll_item_contacts);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.ll_contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you select 用户" + position,Toast.LENGTH_SHORT).show();
            }
        });

        ContactsBean contactsBean = data.get(position);
        viewHolder.iv_contacts.setImageResource(contactsBean.getContactsImage());
        viewHolder.tv_userId.setText(contactsBean.getContactsId());

        return convertView;
    }

    private class ViewHolder{
        ImageView iv_contacts;
        TextView tv_userId;
        LinearLayout ll_contacts;
    }
}
