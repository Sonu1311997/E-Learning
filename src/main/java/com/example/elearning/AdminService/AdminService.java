package com.example.elearning.AdminService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.elearning.AdminRepository.AdminRepository;
import com.example.elearning.Admindomain.Admin;

@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public Admin saveAdmin(Admin admin) {
		return adminRepository.save(admin);
	}
	
	public List<Admin> saveAdmins(List<Admin> admins) {
		return adminRepository.saveAll(admins);
	}
	
	 public List<Admin> getAdmins() {
	        return adminRepository.findAll();
	    }

	
	public Admin getAdminById(long admin_id) {
		return adminRepository.findById(admin_id).orElse(null);
	}
	
	public Admin getAdminByName(String name) {
		return adminRepository.findByName(name);
	}
	
	public String deleteAdmin(long admin_id) {
		adminRepository.deleteById(admin_id);
		return "Admin Deleted Successfully !!" +admin_id;
	}
	
	 public Admin updateAdmin(Admin admin) {
	        Admin existingAdmin = adminRepository.findById(admin.getAdmin_id()).orElse(null);
	        existingAdmin.setName(admin.getName());
	        existingAdmin.setEmail(admin.getEmail());
	        existingAdmin.setPassword(admin.getPassword());
	        return adminRepository.save(existingAdmin);
	    }

}
