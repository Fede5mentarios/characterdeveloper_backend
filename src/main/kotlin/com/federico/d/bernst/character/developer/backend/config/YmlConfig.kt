package com.federico.d.bernst.character.developer.backend.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties(prefix = "base")
@EnableConfigurationProperties
data class YmlConfig(val url: String)