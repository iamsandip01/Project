package com.jdbcdemo.studentmgt.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jdbcdemo.studentmgt.dao.StudentDAO;
import com.jdbcdemo.studentmgt.entity.Address;
import com.jdbcdemo.studentmgt.entity.Student;
import com.jdbcdemo.studentmgt.util.HiberUtil;

//create studentdaoimpl class and implement by studentdao
public class StudentDAOimpl implements StudentDAO{
//create HiberUtil object instance
	HiberUtil hu = new HiberUtil();
	//session instance
	Session session = hu.getSession();

	//get Student record method
	public Student getStudent(int id) {

		return session.get(Student.class, id);
	}

	//delete method
	public void deleteStudent(int id) {
		Student s = getStudent(id);
		Transaction tx = session.beginTransaction();
		session.delete(s);
		tx.commit();

	}

	//insert method
	public void insertStudent(int id, String name, String contact, Address address) {
		Transaction tx = session.beginTransaction();

		Student s = new Student(id, name, contact, address);
		s.setAddress(address);
		session.save(s);
		tx.commit();
		System.out.println("Record inserted successfully....");

	}

	//update method
	public void updateStudent(int id, String name, String contact, Address address) {
		Student s = getStudent(id);
		s.setSname(name);
		s.setContact(contact);
		s.setAddress(address);
		Transaction tx = session.beginTransaction();
		session.update(s);
		tx.commit();
		System.out.println("Updated Successfully....");

	}
	
	//session close method
	public void closeSession() {
		session.close();
	}


}
