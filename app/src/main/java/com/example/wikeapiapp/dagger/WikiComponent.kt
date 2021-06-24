package com.example.wikeapiapp.dagger

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import com.example.wikeapiapp.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [WikiDaggerModule::class])
interface WikiComponent {

    @Component.Factory
    interface Factory{
        fun create(@BindsInstance context: Context): WikiComponent
    }
    fun inject(mainActivity: MainActivity)
    fun getViewModelFactory(): ViewModelProvider.Factory
}