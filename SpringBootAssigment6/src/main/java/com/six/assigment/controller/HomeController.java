package com.six.assigment.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.six.assigment.entity.Customer;
import com.six.assigment.repo.CustomerRepo;
import com.six.assigment.service.CustomerService;

@Controller
public class HomeController {

	@Autowired
	private CustomerService customerService;
	
	

	@RequestMapping("/index")
	public String home() {
		
		return "index";
	}

	@RequestMapping("/register")
	public String register() {

		
		return "register";

	}

	@RequestMapping("/login")
	public String login() {
		
		return "login";
	}

	@PostMapping("/register")
	public String register(Customer customer) {
		// System.out.println(customer);
		try {

			customerService.insertCustomer(customer);
			return "redirect:index?msg=Register Successful";
		} catch (Exception e) {
			//System.out.println(e.getMessage());
			return "redirect:register?error=" + e.getMessage();
		}

	}

	@PostMapping("/login")
	public String login(String username, String password, HttpSession session) {
		if (this.customerService.loginCustomer(username, password)) {
			// System.out.println(username+" "+password);
			
			session.setAttribute("username", username);
			Customer customer = customerService.getCustomer(username);
			session.setAttribute("name", customer.getName());
			
			return "dashboard";
		} else
			return "redirect:login?errormsg=Invalid credential";

	}

	@RequestMapping("/dashboard")
	public String dashboard() {

		
		return "dashboard";

	}

	@RequestMapping("/update")
	public String update() {
		
		return "update";
	}

	@PostMapping("/update")
	public String update(String email, String mobileNo, HttpSession session) {
		try {
		this.customerService.updateCustomer(email, mobileNo, (String) session.getAttribute("username"));
		return "redirect:dashboard?msg=Data update successful";
		}
		catch(Exception e) {
			return "redirect:update?msg="+e.getMessage();
		}

	}

//	@GetMapping("/error")
//	public String errorPage() {
//		return "error";
//	}
//	

}
