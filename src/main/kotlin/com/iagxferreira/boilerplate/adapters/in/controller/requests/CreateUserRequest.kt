package com.iagxferreira.boilerplate.adapters.`in`.controller.requests

import jakarta.validation.constraints.NotBlank

class CreateUserRequest(
    @NotBlank
    val email: String,
)