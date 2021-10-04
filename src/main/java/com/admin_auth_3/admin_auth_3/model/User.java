package com.admin_auth_3.admin_auth_3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank
    @Size(max = 20)
    private String username;
    @NotBlank
    @Size(max = 20)
    private String password;
    @NotBlank
    @Email
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> role = new HashSet<>();

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;

    }
}
