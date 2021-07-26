package com.example.elearning.AdminRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.elearning.Admindomain.Admin;
import com.example.elearning.domain.User;

public interface AdminRepository extends JpaRepository<Admin, Long>  {
	Admin findByName(String name);
}
