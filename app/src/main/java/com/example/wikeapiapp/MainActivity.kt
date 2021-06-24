package com.example.wikeapiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.wikeapiapp.viewmodel.FetchListViewModel
import com.example.wikeapiapp.viewmodel.ViewModelFactory
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    lateinit var viewModel: FetchListViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        (application as App).component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this, viewModelFactory)[FetchListViewModel::class.java]
        viewModel.fetchList()
    }
}