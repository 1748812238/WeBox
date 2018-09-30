package com.example.a321.webox.message;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.a321.webox.R;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends Fragment {

    private ListView lv;
    private List<MessageBean> data;
    private MessageAdapter messageAdapter;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_message,container,false);
        lv = view.findViewById(R.id.lv_activity_message);

        data = new ArrayList<>();

        for(int i = 0; i < 20;i++){
            MessageBean messageBean = new MessageBean();
            messageBean.setUserImage(R.drawable.contact);
            messageBean.setMessage("朋友消息" + i);
            messageBean.setMessageTime("发送时间" + i);
            messageBean.setUserId("朋友ID" + i);
            data.add(messageBean);
        }

        messageAdapter = new MessageAdapter(view.getContext(),data);

        lv.setAdapter(messageAdapter);

        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if(hidden){

        }else {

        }
    }
}
