package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "Pet")
public class Pet {
	@Id 
	@Column (name= "pet_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int petID;
	
	@Column(name= "name", unique= false, nullable= false)
	private String name;
	
	@Column(name= "type", unique= false, nullable= false)
	private String type;
	
	@Column(name= "weight", unique= false, nullable= false)
	private String weight;
	
	@ManyToOne (fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn (name= "user_id")
	private User user ;
	
	@OneToOne (mappedBy = "pet", fetch= FetchType.EAGER)
	private Insurance ins;

	public Pet(int petID, String name, String type, String weight, User owner) {
		super();
		this.petID = petID;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.user = owner;
	}
	
	
	public Pet(int petID, String name, String type, String weight, User user, Insurance ins) {
		super();
		this.petID = petID;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.user = user;
		this.ins = ins;
	}



	public Insurance getIns() {
		return ins;
	}


	public void setIns(Insurance ins) {
		this.ins = ins;
	}


	public Pet () {
		
	}

	public int getPetID() {
		return petID;
	}

	public void setPetID(int petID) {
		this.petID = petID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public User getOwner() {
		return user;
	}

	public void setOwner(User user) {
		this.user = user;
	}
	
	
}
