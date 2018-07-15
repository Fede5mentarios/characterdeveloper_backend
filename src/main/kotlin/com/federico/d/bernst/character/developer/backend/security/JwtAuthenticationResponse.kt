package com.federico.d.bernst.character.developer.backend.security

data class JwtAuthenticationResponse(val accessToken: String) {
    val tokenType = "Bearer"
}
