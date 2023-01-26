package com.example.api.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/hello")
class HelloController {

    @GetMapping()
    fun say_hello():String{
        return "Hello world!"
    }
}