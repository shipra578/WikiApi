package com.example.wikeapiapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.wikeapiapp.repository.Repo
import javax.inject.Inject

class FetchListViewModel @Inject constructor(): ViewModel() {

    @Inject
    lateinit var repo: Repo

    fun fetchList(){
        repo.fetchList()
    }

}