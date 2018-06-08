package com.atl.edusoftware.web;

import com.atl.edusoftware.business.UserService;
import com.atl.edusoftware.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getIndex(){
        return "index";
    }


    @GetMapping("/login")
    public String getLogin(Model model){
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping(value = "/login")
    public String getLoginInfo(@ModelAttribute("user") User user){
        if(userService.UserValidation(user.getPassword(),user.getEmail())){
            return "/index";
        }
        return "login";
    }


}
