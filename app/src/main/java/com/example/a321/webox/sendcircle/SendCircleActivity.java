package com.example.a321.webox.sendcircle;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.a321.webox.R;
import com.example.a321.webox.sendcircle.emoticons_keyboard.SendActivity;
import com.example.a321.webox.sendcircle.emoticons_keyboard.fragment.EmotionMainFragment;

import static android.content.Context.INPUT_METHOD_SERVICE;

public class SendCircleActivity extends Fragment {

    private EditText et;
    private ImageView iv_select_expression;
    private ImageView iv_select_photo;
    private TextView tv_select_draft;
    private EmotionMainFragment emotionMainFragment;
    private LinearLayout ll_sc;

    private Button btn;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_sendcricle,container,false);
        et = view.findViewById(R.id.et_sc_activity);
//        iv_select_expression = view.findViewById(R.id.iv_select_expression_sc_activity);
//        iv_select_photo = view.findViewById(R.id.iv_select_photo_sc_activity);
//        tv_select_draft = view.findViewById(R.id.tv_select_draft_sc_activity);
        btn = view.findViewById(R.id.btn_next);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(),SendActivity.class);
                startActivity(intent);
            }
        });

        et.setFocusable(true);
        et.setFocusableInTouchMode(true);
        et.requestFocus();
        InputMethodManager im = ((InputMethodManager) view.getContext().getSystemService(INPUT_METHOD_SERVICE));
        im.showSoftInput(et,0);

//        emotionMainFragment = new EmotionMainFragment(view);

//        initEmotionMainFragment();

        return view;
    }

    /**
     * 初始化表情面板
     */
    public void initEmotionMainFragment(){
        //构建传递参数
        Bundle bundle = new Bundle();
        //绑定主内容编辑框
        bundle.putBoolean(EmotionMainFragment.BIND_TO_EDITTEXT,false);
        //隐藏控件
        bundle.putBoolean(EmotionMainFragment.HIDE_BAR_EDITTEXT_AND_BTN,true);
        //替换fragment
        //创建修改实例
        emotionMainFragment =EmotionMainFragment.newInstance(EmotionMainFragment.class,bundle);
//        emotionMainFragment.bindToContentView(et);
        FragmentTransaction transaction =getFragmentManager().beginTransaction();
        // Replace whatever is in thefragment_container view with this fragment,
        // and add the transaction to the backstack
        transaction.replace(R.id.fl_emotionview_main_sc,emotionMainFragment);
//        transaction.addToBackStack(null);
        //提交修改
        transaction.commit();
    }

}
