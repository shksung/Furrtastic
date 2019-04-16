package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Insurance")
public class Insurance {
	@Id 
	@Column (name= "insurance_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int insuranceID;
	
	@Column(name= "amount")
	private float amount; 
	
	@Column(name= "deductible")
	private float deductible; 
	
	@Column(name= "coverage")
	private String coverage;
	
	@Column(name= "monthly")
	private float monthly; 
	
	@OneToOne (cascade = CascadeType.ALL, fetch= FetchType.EAGER)
	@JoinColumn(name= "pet_id")
	private Pet pet;

	public Insurance(int insuranceID, float amount, float deductible, String coverage, float monthly, Pet pet) {
		super();
		this.insuranceID = insuranceID;
		this.amount = amount;
		this.deductible = deductible;
		this.coverage = coverage;
		this.monthly = monthly;
		this.pet = pet;
	}

	public Insurance(int insuranceID, float amount, float deductible, String coverage, float monthly) {
		super();
		this.insuranceID = insuranceID;
		this.amount = amount;
		this.deductible = deductible;
		this.coverage = coverage;
		this.monthly = monthly;
	}

	public int getInsuranceID() {
		return insuranceID;
	}

	public void setInsuranceID(int insuranceID) {
		this.insuranceID = insuranceID;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getDeductible() {
		return deductible;
	}

	public void setDeductible(float deductible) {
		this.deductible = deductible;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public float getMonthly() {
		return monthly;
	}

	public void setMonthly(float monthly) {
		this.monthly = monthly;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceID=" + insuranceID + ", amount=" + amount + ", deductible=" + deductible
				+ ", coverage=" + coverage + ", monthly=" + monthly + ", pet=" + pet + "]";
	}
	
}
