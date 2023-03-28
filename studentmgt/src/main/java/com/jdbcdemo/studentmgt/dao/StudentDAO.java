package com.jdbcdemo.studentmgt.dao;

import com.jdbcdemo.studentmgt.entity.Address;
import com.jdbcdemo.studentmgt.entity.Student;

//create interface
public interface StudentDAO {
	
	//methods
	public Student getStudent(int id);

	public void deleteStudent(int id);

	public void insertStudent(int id, String name, String contact, Address address);

	public void updateStudent(int id, String name, String contact, Address address);

	public void closeSession();
}
