package com.ankitsolution.service;

import java.util.Scanner;

import com.ankitsolution.model.Employee;

/**
 * This class is a main driver class which will create object of different
 * classes & call different methods to show generated email & password of
 * particular employee.
 * 
 * @author Ankit Khandwe
 *
 * @created_On 28-Nov-2021
 */
public class Driver {

	public static void main(String[] args) {
		Employee employee = new Employee("Jhon", "Doe");
		CredentialService cs = new CredentialService();
		char[] generatedPassword;
		String generatedEmail;

		System.out.println("Please enter deparment from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");

		Scanner sc = new Scanner(System.in);
		int deparmentoptions = sc.nextInt();
		switch (deparmentoptions) {
		case 1:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech")
					.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		case 2:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "adm")
					.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		case 3:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr")
					.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		case 4:
			generatedEmail = cs.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "leg")
					.toLowerCase();
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
			break;
		default:
			System.out.println(deparmentoptions + " is not a valid option, Please choose between 1 and 4.");
		}

		sc.close();
	}

}
