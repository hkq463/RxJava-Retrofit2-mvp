package com.gxuwz.retrofitdemo.ui.view;

import com.gxuwz.retrofitdemo.model.MsgList;

import java.util.List;

/**
 * Created by FR on 2016/8/4.
 */
public interface TestView extends MvpView {
    void getData(List<MsgList.DataBean> dataBeen);
}
