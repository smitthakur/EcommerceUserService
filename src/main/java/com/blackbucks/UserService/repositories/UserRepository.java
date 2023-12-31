package com.blackbucks.UserService.repositories;

import com.blackbucks.UserService.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
