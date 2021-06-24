package com.example.wikeapiapp

import android.app.Application
import com.example.wikeapiapp.dagger.DaggerWikiComponent
import com.example.wikeapiapp.dagger.WikiComponent

open class App : Application() {

    val component: WikiComponent by lazy {
        DaggerWikiComponent.factory().create(applicationContext)
    }
}