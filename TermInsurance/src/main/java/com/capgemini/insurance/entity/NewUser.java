package com.capgemini.insurance.entity;

import javax.persistence.Entity;

@Entity
public class NewUser {
	private int userId;
	private String name;
	private int age;
	private int salaryInLPA;
	private String address;
	private long mobile;
	private String idProofType;
	private int idProofNum;
	public NewUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewUser(int userId, String name, int age, int salaryInLPA, String address, long mobile, String idProofType,
			int idProofNum) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.salaryInLPA = salaryInLPA;
		this.address = address;
		this.mobile = mobile;
		this.idProofType = idProofType;
		this.idProofNum = idProofNum;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalaryInLPA() {
		return salaryInLPA;
	}
	public void setSalaryInLPA(int salaryInLPA) {
		this.salaryInLPA = salaryInLPA;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getIdProofType() {
		return idProofType;
	}
	public void setIdProofType(String idProofType) {
		this.idProofType = idProofType;
	}
	public int getIdProofNum() {
		return idProofNum;
	}
	public void setIdProofNum(int idProofNum) {
		this.idProofNum = idProofNum;
	}
	
}
