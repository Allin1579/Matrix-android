package com.allin.matrix.base;

import com.allin.matrix.protocol.Server;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Allin on 2016/6/25.
 */
public abstract class BaseEngine {

    protected Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Server.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

}
