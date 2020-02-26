package com.spring.user.dao;

import com.spring.user.pojo.Student;

public interface StudentDao {

	public int save(Student s);
	public Student findByUsername(String username)throws Exception;
	public Student login(String username,String password) throws Exception;
}
