package com.atl.edusoftware.business.services

import com.atl.edusoftware.data.model.User

interface UserService {
    User findUserByEmail(String email)

    void saveUser(User user)
}