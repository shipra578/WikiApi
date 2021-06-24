package com.example.wikeapiapp.api

import okhttp3.OkHttpClient

interface ApiService {

companion object {

    fun createService(okHttpClient: OkHttpClient,url: String) : ApiService{

    }
}

}