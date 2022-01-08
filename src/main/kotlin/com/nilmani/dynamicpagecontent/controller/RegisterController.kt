package com.nilmani.dynamicpagecontent.controller

import com.nilmani.dynamicpagecontent.Repository.ConsumerRepository
import com.nilmani.dynamicpagecontent.entity.Consumer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping


@Controller
class RegisterController {
    @Autowired
    private lateinit var consumerRepo:ConsumerRepository

    @GetMapping("/")
    fun getHomePage():String{
        return "HousePage"
    }
    @GetMapping("/register")
    fun register():String{
        return "Register"
    }
    @GetMapping("/login")
    fun getLogin():String{
        return "/templates/Login"
    }
    @PostMapping("/saveConsumer")
    fun registerConsumer(@ModelAttribute consumer:Consumer, model: Model):String{
        model.addAttribute("consumer",consumer)
        return "redirect:SuccessPage"
    }
}
