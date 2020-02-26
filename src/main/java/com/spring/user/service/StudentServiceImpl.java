package com.spring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.user.dao.StudentDao;
import com.spring.user.pojo.Student;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentDao;
	
	public int save(Student s) {
		// TODO Auto-generated method stub
		return studentDao.save(s);
	}

	public Student findByUsername(String username) throws Exception {
		// TODO Auto-generated method stub
		return studentDao.findByUsername(username);
	}

	public Student login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return studentDao.login(username, password);
	}

}
