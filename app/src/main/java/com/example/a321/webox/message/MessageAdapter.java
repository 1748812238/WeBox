package com.example.a321.webox.message;

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

public class MessageAdapter extends BaseAdapter {

    private Context context;
    private List<MessageBean> data;

    public MessageAdapter(Context context, List<MessageBean> data){
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
        ViewHolder viewHolder = null;
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_message,parent,false);
            viewHolder = new ViewHolder();

            viewHolder.iv_userPortrait = convertView.findViewById(R.id.iv_userImg_item_message);
            viewHolder.tv_userId = convertView.findViewById(R.id.tv_userId_item_message);
            viewHolder.tv_messageTime = convertView.findViewById(R.id.tv_time_item_message);
            viewHolder.tv_message = convertView.findViewById(R.id.tv_message_item_message);
            viewHolder.ll_message = convertView.findViewById(R.id.ll_item_message);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.ll_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"you select 用户" + position,Toast.LENGTH_SHORT).show();
            }
        });

        MessageBean messageBean = data.get(position);
        viewHolder.iv_userPortrait.setImageResource(messageBean.getUserImage());
        viewHolder.tv_userId.setText(messageBean.getUserId());
        viewHolder.tv_messageTime.setText(messageBean.getMessageTime());
        viewHolder.tv_message.setText(messageBean.getMessage());

        return convertView;
    }

    private class ViewHolder{
        ImageView iv_userPortrait;
        TextView tv_userId;
        TextView tv_messageTime;
        TextView tv_message;
        LinearLayout ll_message;
    }
}
