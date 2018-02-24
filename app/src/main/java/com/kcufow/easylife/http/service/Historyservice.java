package com.kcufow.easylife.http.service;

import com.kcufow.easylife.bean.History;
import com.kcufow.easylife.bean.HistoryDetail;
import com.kcufow.easylife.bean.HistoryV2;
import com.kcufow.easylife.bean.HistoryV2Detail;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by ldw on 2018/1/5.
 */

public interface Historyservice {

    String API_HISTORY_V1= "http://api.juheapi.com/";
    String API_HISTORY_V2= "http://v.juhe.cn/";

    @GET("japi/toh")
    Observable<History> fetchHistory(@Query("key") String key
                                    , @Query("v") String v
                                    , @Query("month")String month
                                    , @Query("day")String day);
    @GET("japi/tohdet")
    Observable<HistoryDetail> fetchHistoryDetail(@Query("key") String key
                                                ,@Query("v") String v
                                                ,@Query("id")String id);

    /**
     * 获取历史数据2.0版本
     * @param key appKey
     * @param date 要查询的日期格式 11/1 为11月一号 数字前不用加0
     * @return
     */
    @GET("todayOnhistory/queryEvent.php")
    Observable<HistoryV2> fetchHistoryV2(@Query("key") String key
                                    , @Query("date") String date);



    @GET("todayOnhistory/queryEvent.php")
    Observable<HistoryV2Detail> fetchHistoryDetailV2(@Query("key") String key
                                     , @Query("e_id") String id);
}
