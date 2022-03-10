package com.abrito10.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abrito10.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
