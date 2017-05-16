package org.kotlin.finance.controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController{
    @RequestMapping("/greeting")
    fun getting(@RequestParam name: String) : String{
        return "Hello world $name"
    }
}