package com.example.retrofit1810;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {
    //?appid=57f262786122665cbe313bc17c68c604&units=metric&q=Hanoi
    //dùng dạng Query
    @GET("data/2.5/weather")
    Call<String> getTempCity(@Query("appid")String appid,@Query("units")String units,@Query("q")String q);

}

