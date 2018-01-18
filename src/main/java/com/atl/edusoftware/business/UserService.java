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
}



