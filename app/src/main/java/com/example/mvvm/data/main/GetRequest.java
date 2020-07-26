package com.example.mvvm.data.main;

import com.example.mvvm.data.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetRequest {

    @GET("pages")
    Call<List<User>> getData(@Query("slug") String slug);

}
