package com.gxuwz.retrofitdemo.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.gxuwz.retrofitdemo.ui.view.MvpView;
import com.gxuwz.retrofitdemo.util.ActivityManager;

import butterknife.ButterKnife;

/**
 * Created by JDD on 2016/4/22 0022.
 */
public abstract class BaseActivity extends AppCompatActivity implements MvpView {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 添加Activity到堆栈
        ActivityManager.getAppManager().addActivity(this);
        //设置布局内容
        setContentView(getLayoutId());
        //初始化黄油刀控件绑定框架
        ButterKnife.bind(this);
        //初始化控件
        initViews(savedInstanceState);
    }
    @Override
    protected void onDestroy() {
        // 结束Activity&从堆栈中移除
        ActivityManager.getAppManager().finishActivity(this);
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    public abstract int getLayoutId();

    public abstract void initViews(Bundle savedInstanceState);

    @Override
    public void showLoading(String msg) {
    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showError(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener) {

    }

    @Override
    public void showEmpty(String msg, View.OnClickListener onClickListener, int imageId) {

    }

    @Override
    public void showNetError(View.OnClickListener onClickListener) {

    }
}
