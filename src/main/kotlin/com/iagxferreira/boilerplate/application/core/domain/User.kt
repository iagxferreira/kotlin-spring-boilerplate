package com.iagxferreira.boilerplate.application.core.domain

import java.util.*

data class User(
    val id: UUID = UUID.randomUUID(),
    val email: String
)