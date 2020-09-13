package com.stacksimplify.restservices.Hello;

public class UsersDetails {
	private String firstname;
	private String Lastname;
	private String city;
	
	
	//FIELDS CONSTRUCTOR
	public UsersDetails(String firstname, String lastname, String city) 
	{
		this.firstname = firstname;
		this.Lastname = lastname;
		this.city = city;
	}
	
	//SETTERS AND GETTERS
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//TO STRING
	@Override
	public String toString() {
		return "UsersDetails [firstname=" + firstname + ", Lastname=" + Lastname + ", city=" + city + "]";
	}
	
	

}
