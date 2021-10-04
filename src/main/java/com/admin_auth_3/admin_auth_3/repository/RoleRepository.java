package com.admin_auth_3.admin_auth_3.repository;

import com.admin_auth_3.admin_auth_3.model.ERole;
import com.admin_auth_3.admin_auth_3.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Optional<Role> findByName(ERole name);
}
