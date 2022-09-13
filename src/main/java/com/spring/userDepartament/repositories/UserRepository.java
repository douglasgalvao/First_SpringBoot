package com.spring.userDepartament.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.userDepartament.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
