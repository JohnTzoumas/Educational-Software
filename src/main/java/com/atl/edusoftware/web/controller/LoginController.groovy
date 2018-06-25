package com.atl.edusoftware.web.controller

import com.atl.edusoftware.data.model.User
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.ModelAndView

@Controller
class LoginController {

    @GetMapping("/")
    String getIndex() {
        return "landing"
    }

    @GetMapping("/login")
    String login() {
        return "login"
    }

    @PostMapping("/login")
    ModelAndView getLogin() {
        ModelAndView modelAndView = new ModelAndView()
        User user = new User()
        modelAndView.addObject("user", user)
        modelAndView.setViewName("login")
        return modelAndView
    }
}
