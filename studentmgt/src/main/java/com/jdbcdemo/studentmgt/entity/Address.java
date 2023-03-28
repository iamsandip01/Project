package com.jdbcdemo.studentmgt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class Address {
	@Id
	@GeneratedValue
	private int aid;
	private String hno;
	private String area;
	private String city;
	private String state;
	private int pin;
	
	public Address(){
		super();
		
	}
	public Address(String hno,String area,String city,String state,int pin)
	{
		super();
		this.hno=hno;
		this.area=area;
		this.city=city;
		this.state=state;
		this.pin=pin;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [aid=" + aid + ", hno=" + hno + ", area=" + area + ", city=" + city + ", state=" + state
				+ ", pin=" + pin + "]";
	}
	
	
}
