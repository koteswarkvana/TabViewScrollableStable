package com.koti.apple.tabviewscrollablestable;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

/**
 * MyViewPager for swipe fragments.
 */
public class MyViewPager extends ViewPager {
    private boolean enabled;
    public MyViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.enabled = false;
    }

    /*@Override
    protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
        *//*if (v instanceof SurfaceView || v instanceof PagerTabStrip) {
            return(true);
        }

        return(super.canScroll(v, checkV, dx, x, y));*//*
        return true;
    }*/

    @Override
     public boolean onTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.enabled) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}