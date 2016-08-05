package com.gxuwz.retrofitdemo.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Retrofit工具类
 * author：hkq
 * Date：16/7/29 下午3:40
 * 单例模式
 */
public class RetrofitHelper {

    private static RetrofitHelper rfHelper;

    //网络请求的接口
    public static final String BASE_URL = "http://sns.maimaicha.com/";
    //OkHttpClient网络超时时间
    private static final int DEFAULT_TIMEOUT = 10;
    //全局变量配置OkHttpClient
    private static OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
            //打印OkHttp请求log日志
            .addInterceptor
            (new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .connectTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)//设置超时时间
            .readTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS)//设置读取超时时间
            .writeTimeout(DEFAULT_TIMEOUT, TimeUnit.SECONDS).build();//设置写入超时时间
    //此处设置的是自定义的OkHttp缓存大小以及位置
//            int cacheSize = 10 * 1024 * 1024; // 10 MiB
//            Cache cache = new Cache(App.getContext().getCacheDir(), cacheSize);
//            builder.cache(cache);

    //单例模式得到RetrofitHelper
    public static RetrofitHelper getInstance() {
        if (rfHelper == null) {
            synchronized (RetrofitHelper.class) {
                rfHelper = new RetrofitHelper();
            }
        }
        return rfHelper;
    }

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public  <T> T createApi(Class<T> clazz) {
        return retrofit.create(clazz);
    }
}
