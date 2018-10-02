package com.example.a321.webox.sendcircle.emoticons_keyboard.emoticonkeyboardview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class WbNoHorizontalScrollerViewPager extends ViewPager {


    public WbNoHorizontalScrollerViewPager(Context context) {
        super(context);
    }

    public WbNoHorizontalScrollerViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    /**
     * 重写拦截事件，返回值设置为false，这时便不会横向滑动了。
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }

    /**
     * 重写拦截事件，返回值设置为false，这时便不会横向滑动了。
     * @param ev
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        return false;
    }


}
