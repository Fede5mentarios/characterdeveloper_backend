package com.federico.d.bernst.character.developer.backend.security

import org.slf4j.LoggerFactory
import org.springframework.security.core.AuthenticationException
import org.springframework.security.web.AuthenticationEntryPoint
import org.springframework.stereotype.Component
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

@Component
class JwtAuthenticationEntryPoint : AuthenticationEntryPoint {

    val logger = LoggerFactory.getLogger(javaClass)

    override fun commence(httpServletRequest: HttpServletRequest,
                          httpServletResponse: HttpServletResponse,
                          e: AuthenticationException) {
        logger.error("Responding with unauthorized error. Message - {}", e.message)
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED,
                "Sorry, You're not authorized to access this resource.")
    }
}
