package com.example.elearning.controller;

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
import com.example.elearning.Contactdomain.Contact;
import com.example.elearning.domain.User;
import com.example.elearning.repository.UserRepository;
import com.example.elearning.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/addUser")
	public User addUser(@RequestBody User user) {
		return service.saveUser(user);
	}

	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users) {
		return service.saveUsers(users);
	}

	@GetMapping("/users")
	public List<User> findAllUsers() {
		return service.getUsers();
	}

	@GetMapping("/userById/{id}")
	public User findUserById(@PathVariable long id) {
		return service.getUserById(id);
	}

	@GetMapping("/user/{name}")
	public User findUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}

//	@PutMapping("/update")
//	public User updateUser(@RequestBody User user) {
//		return service.updateUser(user);
//	}
//	
//	@DeleteMapping("/delete/{id}")
//    public String deleteUser(@PathVariable long id) {
//        return service.deleteUser(id);
//    }
	
	
	
private final UserRepository service1;
    
    public UserController(UserRepository service1) {
    	this.service1 = service1;
    }
    
    @GetMapping("/")
    public String view()
    {
    	return "index";
    }

	@GetMapping("/user")
	public String view1(User user1)
	{
		return "userhome";
	}
			
			@GetMapping("/insert")
		    public String view4(User user1)
		    {
		    	return "insertPage";
		    }
					
			@PostMapping("/add")
		    public String view2(User user1)
		    {
				service1.save(user1);
		    	return "index";
		    }
			
			@GetMapping("/insertt")
		    public String view7(User user1)
		    {
		    	return "insertPagee";
		    }
			
			@PutMapping("/updateuser")
			public String view8(@RequestBody User user1) {
			    service1.save(user1);
				return "display";
			}
			
			@GetMapping("/insertu")
		    public String view13(User user1)
		    {
		    	return "insertPageee";
		    }
			
			@DeleteMapping("/deleteuser/{id}")
		    public String deleteUser(@PathVariable long id) {
		        service1.deleteById(id);
		        return "user deleted successfully";
		    }
	
			@GetMapping("/display")
			public String view3(Model m)
			{
				List list= service1.findAll();
				if(!list.isEmpty())
				{
					m.addAttribute("data",list);
				}
				else {
					m.addAttribute("msg","RECORD DOES NOT EXIST");
				}
				return "display";
			}
			
			

}
