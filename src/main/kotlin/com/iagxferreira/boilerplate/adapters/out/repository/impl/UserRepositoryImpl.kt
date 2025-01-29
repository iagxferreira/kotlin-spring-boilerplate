package com.iagxferreira.boilerplate.adapters.out.repository.impl

import com.iagxferreira.boilerplate.adapters.out.repository.UserRepository
import com.iagxferreira.boilerplate.application.core.domain.User
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Repository

@Repository
class UserRepositoryImpl(
    private val jdbc: NamedParameterJdbcTemplate
) : UserRepository {
    override fun create(user: User) {
        val sql = "INSERT INTO users (email) VALUES (:email)"

        val params = MapSqlParameterSource()
            .addValue("email", user.email)

        jdbc.update(sql, params)
    }
}