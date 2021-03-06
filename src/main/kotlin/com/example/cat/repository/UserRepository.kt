package com.example.cat.repository

import com.example.cat.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<User,Long> {
    fun findByEmail(email:String): User?
}