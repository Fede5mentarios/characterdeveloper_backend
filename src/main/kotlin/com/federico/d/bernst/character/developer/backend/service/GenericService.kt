package com.federico.d.bernst.character.developer.backend.service

import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
abstract class GenericService {
    protected val log = LoggerFactory.getLogger(javaClass)
}