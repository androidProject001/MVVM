package com.ittianyu.mvvm.application.e_simple_data_source.common.repository.remote;


import com.ittianyu.mvvm.application.e_simple_data_source.common.bean.User;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;


/**
 * Created by 86839 on 2017/10/6.
 */

public interface UserApi {
    @GET("/users/{username}")
    Call<User> queryUserByUsername(@Path("username") String username);
}