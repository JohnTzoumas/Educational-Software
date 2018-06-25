package com.atl.edusoftware.web.controller

import com.atl.edusoftware.business.services.UserService
import com.atl.edusoftware.data.model.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.servlet.ModelAndView

import javax.validation.Valid

@Controller
@RequestMapping(value = "/registration")
class RegistrationController {

    @Autowired
    private UserService userService

    @GetMapping
    ModelAndView getRegistration() {
        ModelAndView modelAndView = new ModelAndView()
        User user = new User()
        modelAndView.addObject("user", user)
        modelAndView.setViewName("registration")
        return modelAndView
    }

    @PostMapping
    ModelAndView createUser(@Valid User user, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView()
        User userExists = userService.findUserByEmail(user.email)
        if (userExists != null) {
            bindingResult.rejectValue("email", "error.user", "There is already a user registered with the email provided")
        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("registration")
        } else {
            userService.saveUser(user)
            modelAndView.addObject("successMessage", "User has been registered successfully")
            modelAndView.addObject("user", new User())
            modelAndView.setViewName("registration")

        }
        return modelAndView
    }

}

