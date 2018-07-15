package com.federico.d.bernst.character.developer.backend.security

import com.fasterxml.jackson.annotation.JsonIgnore
import com.federico.d.bernst.character.developer.backend.model.Usuario
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import java.util.ArrayList
import org.springframework.security.core.userdetails.UserDetails


data class LoguedUser(
        val id: Long?,
        val usuario: String,
        val nombre: String,
        @JsonIgnore val pass: String,
//        private val permisos: PermisosUsuario? = null,
        val auths: Collection<GrantedAuthority>) : UserDetails {

    override fun getAuthorities() = auths.toMutableList()

    override fun getUsername() = usuario

    override fun getPassword() = pass

    override fun isAccountNonExpired() = true

    override fun isAccountNonLocked() = true

    override fun isCredentialsNonExpired() = true

    override fun isEnabled() = true

    companion object {

        fun create(user: Usuario): LoguedUser {
            val authorities = ArrayList<GrantedAuthority>()
            authorities.add(SimpleGrantedAuthority(user.rol.nombre))
            return LoguedUser(user.id,
                    user.username,
                    user.nombre,
                    user.password,
//                    user.permisos(),
                    authorities)
        }
    }
}
