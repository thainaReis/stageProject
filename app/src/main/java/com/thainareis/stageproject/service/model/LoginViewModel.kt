package com.thainareis.stageproject.service.model

import android.util.Log
import com.thainareis.stageproject.service.StageProjectService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class LoginViewModel {

    fun init() {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val service: StageProjectService =
            retrofit.create<StageProjectService>(StageProjectService::class.java)

        val listRepos = service.listRepos("thainaReis")
        listRepos.enqueue(object : Callback<List<LoginResponse>> {
            override fun onFailure(call: Call<List<LoginResponse>>, t: Throwable) {
                Log.e("error", t.message ?: "error desconhecido")

            }

            override fun onResponse(
                call: Call<List<LoginResponse>>,
                response: Response<List<LoginResponse>>
            ) {
                if (response.isSuccessful) {
                    Log.d("sucesso", "sucesso")
                    val result = response.body()
                } else {
                    Log.e("error", response.errorBody().toString())
                }
            }

        })
    }
}