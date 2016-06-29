package com.allin.matrix.base;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Allin on 2016/6/25.
 */
public abstract class BaseEngine {
    protected final String TAG = getTAG();

    protected Retrofit getRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    protected void creatProtocal(final Class<?> protocal){
        getRetrofit().create(protocal);
    }

    private String getTAG(){
        Class clazz = this.getClass();
        return clazz.getSimpleName();
    }

}
