package com.atl.edusoftware.data.repository

import com.atl.edusoftware.data.model.Role
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository("roleRepository")
interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByRole(String role)
}
