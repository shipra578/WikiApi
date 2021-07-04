package com.example.wikeapiapp.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.wikeapiapp.viewmodel.FetchListViewModel
import com.example.wikeapiapp.viewmodel.ViewModelFactory
import com.example.wikeapiapp.viewmodel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [WikiApiDaggerModule::class])
abstract class WikiDaggerModule{

    @Binds
    internal abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(FetchListViewModel::class)
    internal abstract fun postListViewModel(viewModel: FetchListViewModel): ViewModel
}