package com.theapphideaway.firstapplication

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MyViewModel: ViewModel() {

    val webService = WebService()

    val liveDataItem = MutableLiveData<List<ToDoResponse>>()

    fun getTodoItems(){
        GlobalScope.launch(Dispatchers.IO) {
            val items = webService.getInformationFromInterface().getTodoList().await()

            liveDataItem.postValue(items)
        }
    }
}