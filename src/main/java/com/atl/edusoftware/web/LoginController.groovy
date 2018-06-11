package com.atl.edusoftware.web

import com.atl.edusoftware.business.services.QuizService
import com.atl.edusoftware.business.services.UserService
import com.atl.edusoftware.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
class LoginController {

    @Autowired
    private final UserService userService

    @Autowired
    private QuizService quizService;

    @Autowired
    LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    String getIndex() {
        def all = quizService.findAll()
        return "index";
    }

    @GetMapping("/login")
    String getLogin(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping(value = "/login")
    String getLoginInfo(@ModelAttribute UserLoginRequest request, Model model) {
        if (userService.UserValidation(request.password, request.email)) {
            return "/index";
        }
        return "login";
    }
}
