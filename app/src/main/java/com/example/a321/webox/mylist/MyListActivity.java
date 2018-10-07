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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            for(int j = 0 ; j < 6 ; j++){
                Map<String,Object> map = new HashMap<String,Object>();
                map.put("img",R.drawable.icon_face_pop);
                myListBean.getList().add(map);
            }
            myListBean.setId("id" + i);
            myListBean.setMessage("message" + i);
            myListBean.setTime("time" + i);
            data.add(myListBean);
        }

        myListAdapter = new MyListAdapter(view.getContext(),data);
        lv.setAdapter(myListAdapter);

        return view;
    }
}
