package com.gxuwz.retrofitdemo.ui.activity;

import android.os.Bundle;
import android.widget.TextView;

import com.gxuwz.retrofitdemo.R;
import com.gxuwz.retrofitdemo.model.MsgList;
import com.gxuwz.retrofitdemo.presenter.TestPresenter;
import com.gxuwz.retrofitdemo.ui.view.TestView;
import com.gxuwz.retrofitdemo.util.ToastUtils;

import java.util.List;

import butterknife.Bind;

public class MainActivity extends BaseActivity implements TestView {

    @Bind(R.id.text)
    TextView text;

    private TestPresenter testPresenter;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews(Bundle savedInstanceState) {
        //初始化Presenter
        testPresenter = new TestPresenter();
        testPresenter.attachView(this);
        testPresenter.getDate("1", "10", "我");
    }

    @Override
    public void getData(List<MsgList.DataBean> dataBean) {
        ToastUtils.showToast(dataBean.get(0).getTitle());
        text.setText(dataBean.get(0).getTitle());
    }
}
