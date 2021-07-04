package com.example.wikeapiapp.api

import android.util.Log
import com.example.wikeapiapp.api.data.data.ResponseWiki
import com.example.wikeapiapp.util.RemoteUtils
import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


interface ApiService {

    @GET("api.php?")
    fun getDataTitle(
        @Query(" gpssearch") format: String
    ): Call<ResponseWiki>

    companion object {

        val TAG: String? = ApiService::class.simpleName
        fun createService(): ApiService {
            val httpClient =
                OkHttpClient().newBuilder().addInterceptor(addRequestInterceptor())
                    .addInterceptor(HttpLoggingInterceptor()).build()
            val retrofit = Retrofit.Builder()
                .baseUrl(RemoteUtils.MAIN_URL)
                .client(httpClient)
                .addConverterFactory(
                    GsonConverterFactory.create(
                        GsonBuilder().setLenient().create()
                    )
                )
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return retrofit.create(ApiService::class.java)
        }

        /**
         * [addRequestInterceptor]: building interceptor with the default query parameters required for wiki search
         *
         */
        private fun addRequestInterceptor(): Interceptor {

            return Interceptor { chain ->
                val original: Request = chain.request()
                val url = chain.request().url.newBuilder()
                    .addQueryParameter(RemoteUtils.ACTION_KEY, RemoteUtils.ACTION_VALUE)
                    .addQueryParameter(RemoteUtils.GENERATOR_KEY, RemoteUtils.GENERATOR_VALUE)
                    .addQueryParameter(
                        RemoteUtils.FORMAT_VERSION_KEY,
                        RemoteUtils.FORMAT_VERSION_VALUE
                    )
                    .addQueryParameter(RemoteUtils.PROP_KEY, RemoteUtils.PROP_VALUE)
                    .addQueryParameter(RemoteUtils.GPS_LIMIT_KEY, RemoteUtils.GPS_LIMIT_VALUE)
                    .addQueryParameter(RemoteUtils.PILIMIT_KEY, RemoteUtils.PILIMIT_VALUE)
                    .addQueryParameter(RemoteUtils.PIPROP_KEY, RemoteUtils.PIPROP_VALUE)
                    .addQueryParameter(RemoteUtils.PITHUMBSIZE_KEY, RemoteUtils.PITHUMBSIZE_VALUE)
                    .addQueryParameter(RemoteUtils.WBPTTERMS_KEY, RemoteUtils.WBPTTERMS_VALUE)
                    .addQueryParameter(RemoteUtils.FORMAT_KEY, RemoteUtils.FORMAT_VALUE)
                    .build()
                // Request customization: add request headers
                val requestBuilder: Request.Builder = original.newBuilder().url(url)
                val request: Request = requestBuilder.build()
                Log.d(TAG, "**************URL is: " + request.url.toString())
                chain.proceed(request)
            }
        }
    }

}