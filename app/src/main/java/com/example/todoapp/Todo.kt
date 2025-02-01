package com.example.todoapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.Date

@Entity
data class Todo(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
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