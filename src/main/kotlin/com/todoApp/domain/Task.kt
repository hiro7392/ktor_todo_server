package com.todoApp.domain

import java.time.LocalDateTime


data class Task(
    val id: String,
    val title: String,
    val description: String?,
    val deadline: LocalDateTime,
    val completed:  Boolean,
    val createdAt:LocalDateTime,
    val updatedAt:LocalDateTime,
){
    init {

    }
    fun complete():Task{
        return Task(
            this.id,
            this.title,
            this.description,
            deadline,
            completed=true,
            createdAt,
            updatedAt,
        )
    }
    fun updateDeadline( newDeadline:LocalDateTime):Task{
        return Task(
            this.id,
            this.title,
            this.description,
            newDeadline,
            completed,
            createdAt,
            updatedAt,
        )
    }
    fun updateDescription( newDescription:String):Task{
        return Task(
            this.id,
            this.title,
            newDescription,
            deadline,
            completed,
            createdAt,
            updatedAt,
        )
    }

}