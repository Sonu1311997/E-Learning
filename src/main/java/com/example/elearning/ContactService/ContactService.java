package com.example.elearning.ContactService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elearning.ContactRepository.ContactRepository;
import com.example.elearning.Contactdomain.Contact;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository contactRepository;
	
	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
	}
	
	public List<Contact> saveContacts(List<Contact> contacts) {
		return contactRepository.saveAll(contacts);
	}
	
	 public List<Contact> getContacts() {
	        return contactRepository.findAll();
	    }

	
	public Contact getContactById(long user_id) {
		return contactRepository.findById(user_id).orElse(null);
	}
	
	public Contact getContactByName(String name) {
		return contactRepository.findByName(name);
	}
	
	public String deleteContact(long user_id) {
		contactRepository.deleteById(user_id);
		return "Contact Deleted Successfully !!" +user_id;
	}
	
	 public Contact updateContact(Contact contact) {
	        Contact existingContact = contactRepository.findById(contact.getUser_id()).orElse(null);
	        existingContact.setName(contact.getName());
	        existingContact.setEmail(contact.getEmail());
	        existingContact.setPhone_no(contact.getPhone_no());
	        existingContact.setMessage(contact.getMessage());
	        existingContact.setContact_id(contact.getContact_id());
	        
	        return contactRepository.save(existingContact);
	    }


}
