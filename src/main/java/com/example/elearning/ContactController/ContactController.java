package com.example.elearning.ContactController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.elearning.Admindomain.Admin;
import com.example.elearning.ContactRepository.ContactRepository;
import com.example.elearning.ContactService.ContactService;
import com.example.elearning.Contactdomain.Contact;

@Controller
public class ContactController {

	
	@Autowired
	private ContactService service3;

	@PostMapping("/addContact")
	public Contact addContact(@RequestBody Contact contact) {
		return service3.saveContact(contact);
	}

	@PostMapping("/addContacts")
	public List<Contact> addContacts(@RequestBody List<Contact> contacts) {
		return service3.saveContacts(contacts);
	}

	@GetMapping("/contacts")
	public List<Contact> findAllContacts() {
		return service3.getContacts();
	}

	@GetMapping("/contactById/{id}")
	public Contact findContactById(@PathVariable long user_id) {
		return service3.getContactById(user_id);
	}
//
//	@GetMapping("/user/{name}")
//	public User findUserByName(@PathVariable String name) {
//		return service.getUserByName(name);
//	}
//
//	@PutMapping("/updatecontact")
//	public Contact updateContact(@RequestBody Contact contact) {
//		return service3.updateContact(contact);
//	}
//	
//	@DeleteMapping("/deletecontact/{id}")
//    public String deleteContact(@PathVariable long user_id) {
//        return service3.deleteContact(user_id);
//    }
	
	
	
private final ContactRepository service4;
    
    public ContactController(ContactRepository service4) {
    	this.service4 = service4;
    }
    
    @GetMapping("/vi")
    public String vi()
    {
    	return "index";
    }
    
    
	@GetMapping("/contact")
    public String view1(Contact contact1)
    {
    	return "contacthome";
    }
	
			@GetMapping("/insert2")
		    public String view4(Contact contact1)
		    {
		    	return "insertPage2";
		    }
			
			@PostMapping("/add2")
		    public String view2(Contact contact1)
		    {
				service4.save(contact1);
		    	return "index";
		    }
			
			
			@GetMapping("/insert23")
		    public String view5(Contact contact1)
		    {
		    	return "insertPage23";
		    }
			
			@PutMapping("/updatecontact")
			public String view6(@RequestBody Contact contact1) {
			    service4.save(contact1);
				return "display2";
			}
			
			@GetMapping("/insert2.1")
		    public String view12(Contact contact)
		    {
		    	return "insertPage2.1";
		    }
			
			@DeleteMapping("/deletecontact/{id}")
		    public String deleteContact(@PathVariable long user_id) {
		        service4.deleteById(user_id);
		        return "user deleted successfully";
		    }
	
			@GetMapping("/display2")
			public String view3(Model m)
			{
				List list= service4.findAll();
				if(!list.isEmpty())
				{
					m.addAttribute("data2",list);
				}
				else {
					m.addAttribute("msg1","RECORD DOES NOT EXIST");
				}
				return "display2";
			}
	
		
	
	

}
