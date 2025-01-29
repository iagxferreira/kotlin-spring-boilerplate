package com.iagxferreira.boilerplate.application.ports.`in`.users

import com.iagxferreira.boilerplate.application.core.domain.User

interface CreateUserInputPort {
    fun handle(user: User)
}