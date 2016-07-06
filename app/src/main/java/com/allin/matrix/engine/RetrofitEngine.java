package com.allin.matrix.engine;

import com.allin.matrix.base.engine.BaseEngine;
import com.allin.matrix.model.Repo;
import com.allin.matrix.net.protocol.github.GitHubProtocol;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Allin on 2016/6/25.
 */
public class RetrofitEngine extends BaseEngine {

    public void getRepos(){
        GitHubProtocol protocol = getRetrofit().create(GitHubProtocol.class);
        Call<List<Repo>> call = protocol.listRepos("octocat");
        call.enqueue(new Callback<List<Repo>>() {
           @Override
           public void onResponse(Call<List<Repo>> call, Response<List<Repo>> response) {

           }

           @Override
           public void onFailure(Call<List<Repo>> call, Throwable t) {

           }
        });
    }

}
