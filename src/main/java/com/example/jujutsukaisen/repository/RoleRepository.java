package com.example.jujutsukaisen.repository;

import com.example.jujutsukaisen.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}
