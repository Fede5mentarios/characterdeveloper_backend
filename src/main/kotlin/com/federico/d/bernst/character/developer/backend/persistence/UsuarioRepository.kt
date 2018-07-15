package com.federico.d.bernst.character.developer.backend.persistence

import com.federico.d.bernst.character.developer.backend.model.Usuario
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import java.util.*

@RepositoryRestResource(collectionResourceRel = "region", path = "region")
interface UsuarioRepository : JpaRepository<Usuario, Long> {

    //    @Query(value = "select * from ")
    fun findByUnique(username: String): Optional<Usuario>
}