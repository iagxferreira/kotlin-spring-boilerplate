package com.iagxferreira.boilerplate.application.core.usecase

import com.iagxferreira.boilerplate.application.core.domain.User
import com.iagxferreira.boilerplate.application.ports.`in`.users.CreateUserInputPort
import com.iagxferreira.boilerplate.application.ports.out.CreateUserOutputPort

class CreateUserUseCase(
    private val createUserOutputPort: CreateUserOutputPort
) : CreateUserInputPort {
    override fun handle(user: User) {
        createUserOutputPort.handle(user)
    }
}