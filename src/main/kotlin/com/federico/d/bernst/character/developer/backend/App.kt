package com.federico.d.bernst.character.developer.backend

import com.federico.d.bernst.character.developer.backend.config.YmlConfig
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer


@SpringBootApplication
public class App : SpringBootServletInitializer()

@Autowired
lateinit var ymlConfig: YmlConfig

fun configure(application: SpringApplicationBuilder) = application.sources(App::class.java)

fun main(args: Array<String>) {
    SpringApplication(App::class.java).run(*args)
//        runApplication<App>(*args)
}
