package com.example.a321.webox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.a321.webox.contacts.ContactsActivity;
import com.example.a321.webox.mylist.MyListActivity;
import com.example.a321.webox.message.MessageActivity;
import com.example.a321.webox.sendcircle.SendCircleActivity;
import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar bottomTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView(){
        bottomTabBar = findViewById(R.id.bottom_bar);
        bottomTabBar.init(getSupportFragmentManager())
                .addTabItem("消息",R.drawable.msga,R.drawable.msg,MessageActivity.class)
                .addTabItem("联系人",R.drawable.contacta,R.drawable.contact,ContactsActivity.class)
                .addTabItem("发圈",R.drawable.snsa,R.drawable.sns,SendCircleActivity.class)
                .addTabItem("列表",R.drawable.mya,R.drawable.my,MyListActivity.class)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name, View view) {

                    }
                })
                .setCurrentTab(0);
    }

}
