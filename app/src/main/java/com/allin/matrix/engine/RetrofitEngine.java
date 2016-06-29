package com.allin.matrix.engine;

import com.allin.matrix.base.BaseEngine;
import com.allin.matrix.model.Repo;
import com.allin.matrix.protocal.GitHubProtocal;
import com.allin.matrix.util.LogUtil;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Allin on 2016/6/25.
 */
public class RetrofitEngine extends BaseEngine {

    public void getRepos(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        GitHubProtocal api = retrofit.create(GitHubProtocal.class);
        Call<List<Repo>> call = api.listRepos("octocat");
        call.enqueue(new Callback<List<Repo>>() {
           @Override
           public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {
               LogUtil.i(TAG, response.toString());
           }

           @Override
           public void onFailure(Call<List<Repo>> call, Throwable t) {
               LogUtil.i(TAG, t.toString());
           }
        });
    }

}
