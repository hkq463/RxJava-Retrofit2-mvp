package com.gxuwz.retrofitdemo;

import android.app.Application;
import android.content.Context;

/**
 * Created by Administrator on 2016/5/31.
 */
public class App extends Application {

    private static App singleton;
    static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext() {
        return mContext;
    }


    public static App getApp() {
        if (singleton == null) {
            synchronized (App.class) {
                singleton = new App();
            }
        }
        return singleton;
    }
}
