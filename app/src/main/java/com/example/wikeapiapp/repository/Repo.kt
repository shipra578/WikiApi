package com.example.wikeapiapp.repository

import android.util.Log
import com.example.wikeapiapp.api.ApiService
import com.example.wikeapiapp.api.data.data.ResponseWiki
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repo @Inject constructor() {

    @Inject
    lateinit var apiService: ApiService

     fun fetchList() {

            apiService.getDataTitle("pen").enqueue(object: Callback<ResponseWiki>{
            override fun onResponse(call: Call<ResponseWiki>, response: Response<ResponseWiki>) {
                if (response.isSuccessful) {
                    Log.e("ok", "Hey this is response: "+response.body())
                }
            }

            override fun onFailure(call: Call<ResponseWiki>, t: Throwable) {
                Log.e("ok", "Hey this is error: "+t.localizedMessage)
            }
        })
    }
}