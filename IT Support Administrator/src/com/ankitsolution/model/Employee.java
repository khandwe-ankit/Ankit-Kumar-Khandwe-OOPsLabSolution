package com.ankitsolution.model;

/**
 * Employee class will store first & last name of the employee through
 * constructor & will provide getter & setters for manipulating them.
 * 
 * @author Ankit Khandwe
 *
 * @created_On 28-Nov-2021
 */
public class Employee {

	String firstName;
	String lastName;

	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
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

}
