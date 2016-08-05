package com.gxuwz.retrofitdemo.api;

import com.gxuwz.retrofitdemo.model.Country;
import com.gxuwz.retrofitdemo.model.MsgList;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * author：hkq
 * Date：16/5/29 下午3:52
 */

public interface HttpInterface {

    @GET("api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.getSlideshow")
    Observable<Country> getCountrys();

    @GET("api?apikey=b4f4ee31a8b9acc866ef2afb754c33e6&format=json&method=news.searcListByTitle")
    Observable<MsgList> search(@Query("page")  String page, @Query("rows")  String rows, @Query("search")  String search);
}
