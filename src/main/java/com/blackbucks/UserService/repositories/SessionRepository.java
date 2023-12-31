package com.blackbucks.UserService.repositories;

import com.blackbucks.UserService.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session,Integer> {
}
