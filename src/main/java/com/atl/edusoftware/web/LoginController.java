package com.atl.edusoftware.web;


import com.atl.edusoftware.business.UserService;
import com.atl.edusoftware.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin(Model model){
        model.addAttribute("user", new User());//TODO get rid of coupling
        return "login";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String getUsersInfo(@ModelAttribute("user") User user){
        if(userService.UserValidation(user.getPassword(),user.getEmail())){
            return "user";
        }
        return "login";
    }

}
