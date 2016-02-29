package com.jay.pojo;

import java.util.Date;

public class Student {
	
	private String id;
	private String name;
	private Date birthday;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String id, String name, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
	}
	
	public String getIds() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	

}
