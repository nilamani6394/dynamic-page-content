package com.nilmani.dynamicpagecontent.controller

import org.springframework.stereotype.Controller

import org.springframework.web.bind.annotation.GetMapping


@Controller
class RegisterController {
    @GetMapping("/")
    fun getHomePage():String{
        return "HousePage"
    }
    @GetMapping("/register")
    fun register():String{
        return "redirect:/Register"
    }
    @GetMapping("/login")
    fun getLogin():String{
        return "Login"
    }
}