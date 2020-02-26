package com.spring.user.service;

import com.spring.user.pojo.Student;

public interface StudentService {

	public int save(Student s);
	public Student findByUsername(String username)throws Exception;
	public Student login(String username,String password) throws Exception;
}
