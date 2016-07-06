package com.allin.matrix.base.engine;

import com.allin.matrix.net.protocol.Server;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Allin on 2016/6/25.
 */
public abstract class BaseEngine {

    protected Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(Server.BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
