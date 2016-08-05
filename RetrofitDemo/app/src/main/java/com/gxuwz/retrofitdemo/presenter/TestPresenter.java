package com.gxuwz.retrofitdemo.presenter;

import com.gxuwz.retrofitdemo.api.HttpInterface;
import com.gxuwz.retrofitdemo.api.RetrofitHelper;
import com.gxuwz.retrofitdemo.model.MsgList;
import com.gxuwz.retrofitdemo.ui.view.TestView;
import com.gxuwz.retrofitdemo.util.LogUtil;

import java.util.List;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by FR on 2016/8/4.
 */
public class TestPresenter extends BasePresenter<TestView>{
    @Override
    public void attachView(TestView mvpView) {
        super.attachView(mvpView);
    }
    @Override
    public void detachView() {
        super.detachView();
    }
    public void getDate(String page, String rows, String search){
        RetrofitHelper.getInstance().createApi(HttpInterface.class)
                .search(page,rows,search)
                .subscribeOn(Schedulers.io())
                .map(new Func1<MsgList, List<MsgList.DataBean>>() {
                    @Override
                    public List<MsgList.DataBean> call(MsgList msgList) {
                        return msgList.getData();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<List<MsgList.DataBean>>() {
                    @Override
                    public void onCompleted() {
                    }
                    @Override
                    public void onError(Throwable e) {
                        LogUtil.d("hkq---","错误-"+e);
                    }
                    @Override
                    public void onNext(List<MsgList.DataBean> dataBeen) {
                        getMvpView().getData(dataBeen);
                    }
                });
    }
}
