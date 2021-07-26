package com.example.elearning.ContactRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.elearning.Contactdomain.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {
	Contact findByName(String name);
}
