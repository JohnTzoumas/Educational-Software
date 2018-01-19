package com.atl.edusoftware.business;

import com.atl.edusoftware.data.entity.User;
import com.atl.edusoftware.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public boolean UserValidation(String password,String email){
        User user = userRepository.findByEmail(email);
        if(user==null){
            return false;
        }
        return user.getPassword().equals(password);
    }

    public boolean UserRegistration(User user){
        System.out.println(user.getEmail() + " " + user.getAge());
        System.out.println(userRepository.findByEmail(user.getEmail())==null);
            //Duplicate email check
            if(userRepository.findByEmail(user.getEmail())==null){

//                user.setAge(Integer.parseInt(user.getAge()));
                userRepository.save(user);
                System.out.println(user.getName()+" is saved");
                return true;
            }
            System.out.println("A user with the email " + user.getEmail() + " already exists");
            return false;
    }
}



