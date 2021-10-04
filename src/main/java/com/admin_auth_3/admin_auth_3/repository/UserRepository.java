package com.admin_auth_3.admin_auth_3.repository;

import com.admin_auth_3.admin_auth_3.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

        Optional<User> findByUsername(String username);

        Boolean existsByUsername(String username);

        Boolean existsByEmail(String email);

}
