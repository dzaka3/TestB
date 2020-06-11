package com.dzaka.test.utils;

import com.dzaka.test.data.model.ChecklistItemRequestDto;
import com.dzaka.test.data.model.LoginRequestDto;
import com.dzaka.test.data.model.UserAccountRequestDto;
import com.google.gson.JsonObject;

import java.util.zip.CheckedInputStream;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {
    @POST("register")
    Call<UserAccountRequestDto> postRegister(@Body JsonObject jsonObject);

    @POST("item")
    Call<ChecklistItemRequestDto> postItem();

    @GET("login")
    Call<LoginRequestDto> getLogin();
}
