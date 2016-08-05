package com.gxuwz.retrofitdemo.util;

import android.widget.Toast;

import com.gxuwz.retrofitdemo.App;


/**
 * Created by Administrator on 2016/6/2.
 */
public class ToastUtils {
    /**
     * 公共的Toast
     */

    private static Toast toast;

    public static void showToast(String content) {
        if (toast == null) {
            toast = Toast.makeText(App.getContext(), content, Toast.LENGTH_SHORT);
        } else {
            toast.setText(content);
        }
        toast.show();
    }
}
