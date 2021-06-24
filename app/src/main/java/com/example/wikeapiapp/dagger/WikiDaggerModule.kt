package com.example.wikeapiapp.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wikeapiapp.api.ApiService
import com.example.wikeapiapp.util.RemoteUtils
import com.example.wikeapiapp.viewmodel.FetchListViewModel
import com.example.wikeapiapp.viewmodel.ViewModelFactory
import com.example.wikeapiapp.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import okhttp3.OkHttpClient
import javax.inject.Named

@Module
abstract class WikiDaggerModule {

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FetchListViewModel::class)
    internal abstract fun postListViewModel(viewModel: FetchListViewModel): ViewModel


    @Binds
    fun bindApiService(okHttpClient: OkHttpClient, @Named(RemoteUtils.MAIN_URL) baseUrl: String): ApiService {
        return ApiService.createService(okHttpClient, baseUrl)
    }
}