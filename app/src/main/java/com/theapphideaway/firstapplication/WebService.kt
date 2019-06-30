package com.theapphideaway.firstapplication

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class WebService {

    val BaseURL = "https://jsonplaceholder.typicode.com/"
    private var retrofit: Retrofit

    init {
        val okHttpClient = OkHttpClient.Builder().build()

        retrofit = Retrofit.Builder()
            .baseUrl(BaseURL)
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    fun getInformationFromInterface(): WebInterface{
        return  retrofit.create(WebInterface::class.java)
    }

}