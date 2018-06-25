package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.model.User
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository("userRepository")
 interface UserRepository extends CrudRepository<User,Long>{
    User findByEmail(String email)
}

