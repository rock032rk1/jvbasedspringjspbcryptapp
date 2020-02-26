package com.spring.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.spring.user.dao.StudentDao;
import com.spring.user.pojo.Student;
import com.spring.user.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentDao;
	
	@GetMapping("/")
	public String loginPage() {
		
		return "login";
	}
	
	@PostMapping("/login")
	public String loginPage1(HttpServletRequest req,Model model) throws Exception {
		
		String username=req.getParameter("username");
		String pass=req.getParameter("password");
		
		studentDao.login(username, pass);
		
		return "success";
	}
	
	@GetMapping("/regist")
	public String registPage() {
		
		return "registration";
	}
	
	@PostMapping("/save")
	public String registPage1(Student s) {
		
		studentDao.save(s);
		
		return "login";
	}
}
