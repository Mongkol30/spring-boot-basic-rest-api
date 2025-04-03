package com.mongkhonapi.crud.repository;

import com.mongkhonapi.crud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
