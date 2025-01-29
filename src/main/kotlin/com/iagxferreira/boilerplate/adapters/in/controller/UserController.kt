package com.iagxferreira.boilerplate.adapters.`in`.controller

import com.iagxferreira.boilerplate.adapters.`in`.controller.requests.CreateUserRequest
import com.iagxferreira.boilerplate.application.core.domain.User
import com.iagxferreira.boilerplate.application.ports.`in`.users.CreateUserInputPort
import jakarta.validation.Valid
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val createUserInputPort: CreateUserInputPort
) {
    @PostMapping
    fun insert(
        @Valid
        @RequestBody
        createUserRequest: CreateUserRequest,
    ): ResponseEntity<Void> {
        createUserRequest.let {
            createUserInputPort.handle(
                User(
                    id = UUID.randomUUID(),
                    email = it.email
                )
            )
        }
        return ResponseEntity.ok().build()
    }
}