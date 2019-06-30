package com.theapphideaway.firstapplication

data class ToDoResponse(
    var completed: Boolean,
    var id: Int,
    var title: String,
    var userId: Int
)