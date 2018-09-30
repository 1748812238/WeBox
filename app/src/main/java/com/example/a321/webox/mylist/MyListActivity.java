package com.example.a321.webox.mylist;

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

public class MyListActivity extends Fragment {

    private View view;
    private List<MyListBean> data;
    private ListView lv;
    private MyListAdapter myListAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.activity_my_list,container,false);

        lv = view.findViewById(R.id.lv_my_list);
        data = new ArrayList<>();

        for(int i = 0;i < 20; i++){
            MyListBean myListBean = new MyListBean();
            myListBean.setMeg(" " + i);
            data.add(myListBean);
        }

        myListAdapter = new MyListAdapter(view.getContext(),data);
        lv.setAdapter(myListAdapter);

        return view;
    }
}
