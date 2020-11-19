package com.thainareis.stageproject.service

import com.thainareis.stageproject.service.model.LoginRequest
import com.thainareis.stageproject.service.model.LoginResponse
import kotlinx.coroutines.Deferred
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

interface StageProjectService {

    @GET("/login")
    fun loginAsync(@Body body: LoginRequest): Deferred <LoginResponse>

    @GET("users/{user}/repos")
    fun listRepos(@Path("user") user: String?): Call<List<LoginResponse>>

    @GET("group/{id}/users")
    fun groupList(@Path("id") groupId: Int): Call<List<LoginRequest>>

    @GET("group/{id}/users")
    fun groupList(@Path("id") groupId: Int, @Query("sort") sort: String?): Call<List<LoginRequest>>

    @GET("group/{id}/users")
    fun groupList(@Path("id") groupId: Int, @QueryMap options: Map<String?, String?>?): Call<List<LoginRequest>>

    @POST("users/new")
    fun createUser(@Body user: LoginRequest): Call<LoginRequest>

    @FormUrlEncoded
    @POST("user/edit")
    fun updateUser(@Field("first_name") first: String?, @Field("last_name") last: String?): Call<LoginRequest>

    @Multipart
    @PUT("user/photo")
    fun updateUser(@Part("photo") photo: RequestBody?, @Part("description") description: RequestBody?): Call<LoginRequest>


    @Headers(*["Accept: application/vnd.github.v3.full+json", "User-Agent: Retrofit-Sample-App"])
    @GET("users/{username}")
    fun getUser(@Path("username") username: String): Call<LoginRequest>
}