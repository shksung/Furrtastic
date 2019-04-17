package com.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "Users")
public class User {
	@Id 
	@Column (name= "user_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int userID;
	
	@Column(name= "first_name", unique= false, nullable= true)
	private String firstName;
	
	@Column(name= "last_name", unique= false, nullable= true)
	private String lastName;
	
	@Column(name= "email", unique= true, nullable= true)
	private String email;
	
	@Column(name= "username", unique= true, nullable= true)
	private String username;
	
	@Column(name= "password", unique= true, nullable= true)
	private String password;
	
	@Column(name= "address", unique= true, nullable= true) //remember to make these back to nullable = false (SIKE)
	private String address;
	
	@Column(name= "state", unique= false, nullable= true)
	private String state;
	
	@Column(name= "city", unique= false, nullable= true)
	private String city;
	
	@Column(name= "zip", unique= false, nullable= true)
	private String zip;
	
	@Column(name= "card", unique= true, nullable= true)
	private String card;
	
	@Column(name= "pin", unique= true, nullable= true)
	private String pin;
	
	@OneToMany(mappedBy = "user", fetch= FetchType.EAGER)
	private List<Pet> petList;
	


	public User(int userID, String firstName, String lastName, String email, String username, String password,
			String address, String state, String city, String zip, String card, String pin, List<Pet> petList) {
		super();
		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.card = card;
		this.pin = pin;
		this.petList = petList;
	}
	
	public User () {
		
	}
	
	public User(String username, String password) {
		super();
		this.username= username;
		this.password= password;
	}
	
	public User (String firstName, String lastName, String email, String address, String state, String city, String zip,  String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		
	}
	

//	public User(String firstName, String lastName, String email, String username, String password, String address,
//			String state, String city, String zip) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.email = email;
//		this.username = username;
//		this.password = password;
//		this.address = address;
//		this.state = state;
//		this.city = city;
//		this.zip = zip;
//	}

	public User(String firstName, String lastName, String email, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCard() {
		return card;
	}

	public void setCard(String card) {
		this.card = card;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public List<Pet> getPetList() {
		return petList;
	}

	public void setPetList(List<Pet> petList) {
		this.petList = petList;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", username=" + username + ", password=" + password + ", address=" + address + ", state=" + state
				+ ", city=" + city + ", zip=" + zip + ", card=" + card + ", pin=" + pin + ", petList=" + petList + "]";
	}
	
	
}
