package com.federico.d.bernst.character.developer.backend.persistence.custom

import javax.persistence.EntityManager
import javax.persistence.PersistenceContext


abstract class GenericRepositoryImpl {
    @PersistenceContext
    lateinit var em: EntityManager
}