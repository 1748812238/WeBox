package com.example.a321.webox.sendcircle.emoticons_keyboard.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.a321.webox.R;

public class Fragment1 extends BaseFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=LayoutInflater.from(getActivity()).inflate(R.layout.fragment1,null);
        TextView tv= (TextView) rootView.findViewById(R.id.tv);

        tv.setText(args.getString("Interge"));
        return rootView ;
    }

}
