package com.group1.team1.repository;


import com.group1.team1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { 
	// save(), findAll(), findById()
}