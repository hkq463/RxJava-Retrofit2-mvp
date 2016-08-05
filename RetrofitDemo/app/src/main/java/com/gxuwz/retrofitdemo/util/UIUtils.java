package com.gxuwz.retrofitdemo.util;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gxuwz.retrofitdemo.App;


/**
 * Created by Administrator on 2016/5/31.
 * 屏幕相关工具类
 */
public class UIUtils {


    /**
     * 获取屏幕的宽度
     */
    public static int getWidth() {
        return App.getContext().getResources().getDisplayMetrics().widthPixels;
    }

    /**
     * 获取屏幕的高度
     */
    public static int getHeigh() {
        return App.getContext().getResources().getDisplayMetrics().heightPixels;
    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dip2px(float dpValue) {
        final float scale = App.getContext().getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * 根据手机的分辨率从 px(像素) 的单位 转成为 dp
     */
    public static int px2dip(float pxValue) {
        final float scale = App.getContext().getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }

    public static View infalte(Context context, @LayoutRes int layoutId, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(layoutId, parent, false);

    }


}
