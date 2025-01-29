package com.iagxferreira.boilerplate.adapters.out

import com.iagxferreira.boilerplate.adapters.out.repository.UserRepository
import com.iagxferreira.boilerplate.application.core.domain.User
import com.iagxferreira.boilerplate.application.ports.out.CreateUserOutputPort
import org.springframework.stereotype.Component

@Component
class CreateUserAdapter(
    private val userRepository: UserRepository
) : CreateUserOutputPort {
    override fun handle(user: User) {
        user.let {
            userRepository.create(it)
        }
    }

}