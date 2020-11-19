package com.thainareis.stageproject.data


import com.thainareis.stageproject.service.model.LoginResponse
import retrofit2.Call
import retrofit2.http.GET


interface UserApi{

    @GET("user/list")
    fun listUsers(): Call<LoginResponse>

}