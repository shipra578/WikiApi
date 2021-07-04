package com.example.wikeapiapp.dagger

import com.example.wikeapiapp.api.ApiService
import com.example.wikeapiapp.util.RemoteUtils
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class WikiApiDaggerModule {

    @Provides
    fun providesApiService(): ApiService = ApiService.createService()
}