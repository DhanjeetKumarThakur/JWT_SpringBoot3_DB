package com.learningJWT.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningJWT.entity.User;

public interface UserRepository extends JpaRepository<User, String> {

	public Optional<User> findByEmail(String email);
}
