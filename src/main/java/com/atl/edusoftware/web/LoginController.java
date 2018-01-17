package com.atl.edusoftware.web;


import com.atl.edusoftware.business.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    public String getLogin() {
        return "login";
    }

    @RequestMapping(method= RequestMethod.POST)
    public String getUsersInfo(@RequestParam(value = "password") String password,@RequestParam(value="email") String email){
        if(userService.UserValidation(password,email)){
            return "user";
        }else{
            return "login";
        }
    }

}
