package com.iagxferreira.boilerplate.adapters.out.repository

import com.iagxferreira.boilerplate.application.core.domain.User

interface UserRepository {
    fun create(user: User)
}