package com.capgemini.insurance.entity;

import javax.persistence.Entity;

@Entity
public class Products {
	private int pId;
	private String pName;
	private int pCost;
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Products(int pId, String pName, int pCost) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pCost = pCost;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpCost() {
		return pCost;
	}
	public void setpCost(int pCost) {
		this.pCost = pCost;
	}
	

}
