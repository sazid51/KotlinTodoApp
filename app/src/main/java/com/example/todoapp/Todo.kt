package com.example.todoapp

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)


fun getFakeTodo(): List<Todo>{
    return listOf<Todo>(
        Todo(1,"First Todo", Date.from(Instant.now())),
        Todo(2,"This is second todo", Date.from(Instant.now())),
        Todo(3,"Third todo is here", Date.from(Instant.now())),
        Todo(4,"I will do forth todo", Date.from(Instant.now()))
    )
}