package com.iagxferreira.boilerplate.application.ports.out

import com.iagxferreira.boilerplate.application.core.domain.User

interface CreateUserOutputPort {
    fun handle(user: User)
}