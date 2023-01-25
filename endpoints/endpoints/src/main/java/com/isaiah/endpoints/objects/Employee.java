package com.isaiah.endpoints.objects;

import java.util.Date;


public class Employee {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String profession;
	private Date dateCreated;
	private String country;
	private String city;
	
	
	public Employee() {
		super();
		this.id = 0;
		this.firstName = "John";
		this.lastName = "Doe";
		this.email = "jDoe@email.com";
		this.profession = "Mailman";
		this.dateCreated = new Date();
		this.country = "U.S.";
		this.city = "Atlanta";
	}
	
	
	public Employee(int id, String firstName, String lastName, String email, String profession, Date dateCreated,
			String country, String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.profession = profession;
		this.dateCreated = dateCreated;
		this.country = country;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	public String getProfession() {
		return profession;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public String getCountry() {
		return country;
	}
	public String getCity() {
		return city;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return  id + "," + firstName + "," + lastName + "," + email
				+ "," + profession + "," + dateCreated + "," + country + ","
				+ city;
	}
	
	
	
	

}
