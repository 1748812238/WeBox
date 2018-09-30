package com.example.a321.webox.sendcircle;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.a321.webox.R;

public class SendCircleActivity extends Fragment {

    private EditText et;
    private ImageView iv_select_expression;
    private ImageView iv_select_photo;
    private TextView tv_select_draft;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_sendcricle,container,false);
        et = view.findViewById(R.id.et_sc_activity);
        iv_select_expression = view.findViewById(R.id.iv_select_expression_sc_activity);
        iv_select_photo = view.findViewById(R.id.iv_select_photo_sc_activity);
        tv_select_draft = view.findViewById(R.id.tv_select_draft_sc_activity);


        return view;
    }
}
