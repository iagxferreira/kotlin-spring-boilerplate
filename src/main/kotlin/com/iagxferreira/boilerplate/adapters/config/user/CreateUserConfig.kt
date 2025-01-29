package com.iagxferreira.boilerplate.adapters.config.user

import com.iagxferreira.boilerplate.adapters.out.CreateUserAdapter
import com.iagxferreira.boilerplate.application.core.usecase.CreateUserUseCase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class CreateUserConfig {
    @Bean
    open fun createUserUseCase(
        createUserAdapter: CreateUserAdapter
    ): CreateUserUseCase {
        return CreateUserUseCase(createUserAdapter)
    }
}