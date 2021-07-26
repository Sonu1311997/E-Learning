package com.example.elearning.Admincontroller;

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

import com.example.elearning.AdminRepository.AdminRepository;
import com.example.elearning.AdminService.AdminService;
import com.example.elearning.Admindomain.Admin;
import com.example.elearning.Contactdomain.Contact;

@Controller
public class AdminController {
	
	@Autowired
	private AdminService service;

	@PostMapping("/addAdmin")
	public Admin addAdmin(@RequestBody Admin admin) {
		return service.saveAdmin(admin);
	}

	@PostMapping("/addAdmins")
	public List<Admin> addAdmins(@RequestBody List<Admin> admins) {
		return service.saveAdmins(admins);
	}

	@GetMapping("/admins")
	public List<Admin> findAllAdmins() {
		return service.getAdmins();
	}

	@GetMapping("/adminById/{id}")
	public Admin findAdminById(@PathVariable long id) {
		return service.getAdminById(id);
	}
//
//	@GetMapping("/user/{name}")
//	public User findUserByName(@PathVariable String name) {
//		return service.getUserByName(name);
//	}

//	@PutMapping("/updateadmin")
//	public Admin updateAdmin(@RequestBody Admin admin) {
//		return service.updateAdmin(admin);
//	}
//	
//	@DeleteMapping("/deleteadmin/{id}")
//    public String deleteAdmin(@PathVariable long id) {
//        return service.deleteAdmin(id);
//    }
//	
//	
	
private final AdminRepository service2;
    
    public AdminController(AdminRepository service2) {
    	this.service2 = service2;
    }
    
    @GetMapping("/vie")
    public String vie()
    {
    	return "index";
    }

	@GetMapping("/admin")
    public String view1(Admin admin1)
    {
    	return "adminhome";
    }
	
			@GetMapping("/insert1")
		    public String view4(Admin admin1)
		    {
		    	return "insertPage1";
		    }
			
			@PostMapping("/add1")
		    public String view2(Admin admin1)
		    {
				service2.save(admin1);
		    	return "index";
		    }
			
			@GetMapping("/insert11")
		    public String view10(Admin admin1)
		    {
		    	return "insertPage11";
		    }
			
			@PutMapping("/updateadmin")
			public String view9(@RequestBody Admin admin1) {
			    service2.save(admin1);
				return "display1";
			}
			
			@GetMapping("/insert1.1")
		    public String view11(Admin admin1)
		    {
		    	return "insertPage1.1";
		    }
			
			@DeleteMapping("/deleteadmin/{id}")
		    public String deleteAdmin(@PathVariable long admin_id) {
		        service2.deleteById(admin_id);
		        return "user deleted successfully";
		    }
			
			@GetMapping("/display1")
			public String view3(Model m)
			{
				List list= service2.findAll();
				if(!list.isEmpty())
				{
					m.addAttribute("data1",list);
				}
				else {
					m.addAttribute("msg1","RECORD DOES NOT EXIST");
				}
				return "display1";
			}
	
	


}
