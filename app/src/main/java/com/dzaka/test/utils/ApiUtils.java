package com.dzaka.test.utils;

public class ApiUtils {
    private ApiUtils() {}

    public static final String BASE_URL = "http://18.141.178.15:8080/";

    public static ApiUtils getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(ApiUtils.class);
    }
}
