package com.allin.matrix.engine;

import com.allin.matrix.base.BaseEngine;
import com.allin.matrix.model.Repo;
import com.allin.matrix.protocal.GitHubProtocal;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;

/**
 * Created by a on 2016/6/25.
 * Author: Allin
 */
public class GitHubEngine extends BaseEngine {

    public static List<Repo> getRepos(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .build();

        GitHubProtocal api = retrofit.create(GitHubProtocal.class);

        Call<List<Repo>> repos = api.listRepos("octocat");
        return null;
    }



}
