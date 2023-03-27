package com.jdbcdemo.studentmgt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="Student")
public class Student 
{
@Id
//@GeneratedValue
//instance variable
  private int sid;
  private String sname;
  private String contact;
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;
  
  //default constructor
  public Student() {
		super();
	}
  //parameterized constructor
  public Student(int sid, String sname, String contact,Address address) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.contact = contact;
		this.address= address;
	}
  //getter setter method
public int getSid() {
	return sid;
}
public void setSid(int sid) {
	this.sid = sid;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getContact() {
	return contact;
}
public void setContact(String contact) {
	this.contact = contact;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", contact=" + contact + ", address=" + address + "]";
} 
  
}