package com.nilmani.dynamicpagecontent.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class DemoController {

    @GetMapping("/get")
    fun getHome():String{
        return "Home"
    }

}