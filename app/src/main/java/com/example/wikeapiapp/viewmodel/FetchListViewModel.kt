package com.example.wikeapiapp.viewmodel

import androidx.lifecycle.ViewModel
import com.example.wikeapiapp.repository.Repo
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class FetchListViewModel @Inject constructor(): ViewModel() {

    @Inject
    lateinit var repo: Repo

    fun fetchList(){
        CoroutineScope(Dispatchers.IO).launch {
            repo.fetchList()
        }

    }

}