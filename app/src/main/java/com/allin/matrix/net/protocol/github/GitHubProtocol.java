package com.allin.matrix.net.protocol.github;


import com.allin.matrix.model.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Allin on 2016/6/25.
 */
public interface GitHubProtocol {
    @GET("users/{user}/repos")
    Call<List<Repo>> listRepos(@Path("user") String user);
}
