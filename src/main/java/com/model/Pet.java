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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name= "Pet")
public class Pet {
	@Id 
	@Column (name= "pet_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int petID;
	
	@Column(name= "name", unique= false, nullable= true)
	private String name;
	
	@Column(name= "type", unique= false, nullable= true)
	private String type;
	
	@Column(name= "weight", unique= false, nullable= true)
	private String weight;
	
	@Column(name= "age", unique= false, nullable= true)
	private String age;
	
	@Column(name= "condition", unique= false, nullable= true)
	private String condition;
	
	@Column(name="user_id", unique= false, nullable= true)
	private int owner ;
	
	@Column ( name = "amount", nullable = true)
	private int amount;

	public Pet(int petID, String name, String type, String weight, int owner) {
		super();
		this.petID = petID;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.owner = owner;
	}
	
	
	
	public Pet(String name, String type, String weight, String age, String condition, int user) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.age= age;
		this.condition= condition;
		this.owner = user;
	}

	
	public Pet(String name, String type, String weight, String age, String condition, int user, int ins) {
		super();
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.age = age;
		this.condition = condition;
		this.owner = user;
		this.amount = ins;
	}



	public Pet(int petID, String name, String type, String weight, int user, int ins) {
		super();
		this.petID = petID;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.owner = user;
		this.amount = ins;
	}



	public int getIns() {
		return amount;
	}


	public void setIns(int ins) {
		this.amount = ins;
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

	public int getOwner() {
		return owner;
	}

	public void setOwner(int user) {
		this.owner = user;
	}



	@Override
	public String toString() {
		return "Pet [petID=" + petID + ", name=" + name + ", type=" + type + ", weight=" + weight + ", age=" + age
				+ ", condition=" + condition + ", owner=" + owner + ", amount=" + amount + "]";
	}




	
	
	
	
}
