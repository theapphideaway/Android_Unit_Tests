package com.theapphideaway.firstapplication

import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface WebInterface {

    @GET("todos")
    fun getTodoList():Deferred<List<ToDoResponse>>
}