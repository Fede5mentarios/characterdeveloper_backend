package com.federico.d.bernst.character.developer.backend.model

data class Usuario(
        val id: Long,
        val username: String,
        val password: String,
        val nombre: String,
        val rol: Rol)
