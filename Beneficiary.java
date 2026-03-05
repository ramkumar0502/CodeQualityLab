package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Beneficiary {
	
	@Id
	private int id;
	private String name;
	private String benefit;
	private int fund;
	public Beneficiary(int id, String name, String beneficiary, int fund) {
		super();
		this.id = id;
		this.name = name;
		benefit = beneficiary;
		this.fund = fund;
	}
	
	public Beneficiary()
	{
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBeneficiary() {
		return benefit;
	}
	public void setBeneficiary(String beneficiary) {
		benefit = beneficiary;
	}
	public int getFund() {
		return fund;
	}
	public void setFund(int fund) {
		this.fund = fund;
	}
	
	
	

}
