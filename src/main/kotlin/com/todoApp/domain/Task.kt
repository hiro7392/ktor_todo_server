package com.todoApp.domain

import java.time.LocalDateTime


data class Task(
    var id: Long,
    var title: String,
    var description: String?,
    var deadline: LocalDateTime,
    var completed:  Boolean,
    var createdAt:LocalDateTime,
    var updatedAt:LocalDateTime,

)