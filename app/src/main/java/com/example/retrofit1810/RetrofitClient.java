package com.example.retrofit1810;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    private static RetrofitClient instance= null;
    private RetrofitClient retrofitClient;
    private RetrofitClient(){

    }
    public static RetrofitClient instance(){
        if(instance==null){
            instance= new RetrofitClient();
        }
        return instance;
    }

    private Retrofit createRetrofit(){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .protocols(Arrays.asList(Protocol.HTTP_1_1))
                .build();
        Gson gson= new GsonBuilder().setLenient().create();
        //https://api.openweathermap.org/data/2.5/weather?appid=57f262786122665cbe313bc17c68c604&units=metric&q=Hanoi
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit;
    }
}
