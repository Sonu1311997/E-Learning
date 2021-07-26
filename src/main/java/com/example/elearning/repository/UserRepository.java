package com.example.elearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.elearning.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String name);

}
