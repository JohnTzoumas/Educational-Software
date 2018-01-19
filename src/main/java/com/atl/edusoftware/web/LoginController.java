package com.atl.edusoftware.web;


import com.atl.edusoftware.business.UserService;
import com.atl.edusoftware.data.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String getIndex(){
        return "index";
    }


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String getLogin(Model model){
        model.addAttribute("user", new User());//TODO get rid of coupling
        return "login";
    }

    @RequestMapping(value = "/login",method= RequestMethod.POST)
    public String getLoginInfo(@ModelAttribute("user") User user){
        if(userService.UserValidation(user.getPassword(),user.getEmail())){
            return "/index";
        }
        return "login";
    }

    @RequestMapping(value = "/registration",method = RequestMethod.GET)
    public String getRegistration(Model model){
        model.addAttribute("user", new User());
        return "registration";
    }

    @RequestMapping(value = "/registration",method= RequestMethod.POST)
    public String getRegistrationInfo(@ModelAttribute("user") User user){
        if(user != null){
//            user.setAge(((int) user.getAge()));
            if(userService.UserRegistration(user)){
                System.out.println("The registration of " + user.getEmail() + " is successful");
                return "/index";
            }else{
                System.out.println("User is null");
                return "registration";
            }
        }
        return "registration";
    }
}
