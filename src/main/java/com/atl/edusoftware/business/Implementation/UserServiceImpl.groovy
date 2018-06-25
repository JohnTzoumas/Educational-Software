package com.atl.edusoftware.business.Implementation

import com.atl.edusoftware.business.services.UserService
import com.atl.edusoftware.commons.Utils
import com.atl.edusoftware.data.model.Role
import com.atl.edusoftware.data.model.User
import com.atl.edusoftware.data.repository.RoleRepository
import com.atl.edusoftware.data.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

import javax.transaction.Transactional

@Service
class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository
    @Autowired
    private RoleRepository roleRepository
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder

    @Override
    User findUserByEmail(String email) {
        userRepository.findByEmail(email)
    }

    @Override
    void saveUser(User user) {
        user.password = bCryptPasswordEncoder.encode(user.password)
        user.active = 1
        Role userRole = roleRepository.findByRole("ADMIN")
        user.roles = new HashSet<Role>(Arrays.asList(userRole))
        userRepository.save(user)
    }

    @Override
    @Transactional
    UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(userName)
        List<GrantedAuthority> authorities = getUserAuthority(user.getRoles())
        return buildUserForAuthentication(user, authorities)
    }

    private List<GrantedAuthority> getUserAuthority(Set<Role> userRoles) {
        Set<GrantedAuthority> roles = new HashSet<GrantedAuthority>()
        for (Role role : userRoles) {
            roles.add(new SimpleGrantedAuthority(role.getRole()))
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<GrantedAuthority>(roles)
        return grantedAuthorities
    }

    private UserDetails buildUserForAuthentication(User user, List<GrantedAuthority> authorities) {
        return new org.springframework.security.core.userdetails.User(user.email, user.password, Utils.numericToBoolean(user.active), true, true, true, authorities)
    }
}



