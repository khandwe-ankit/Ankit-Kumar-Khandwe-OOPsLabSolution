package com.ankitsolution.service;

import java.util.Random;

import com.ankitsolution.model.Employee;

/**
 * This class used to provide services like 1) generatePassword 2)
 * generateEmailAddress 3) showCredentials
 * 
 * @author Ankit Khandwe
 *
 * @created_On 28-Nov-2021
 */

public class CredentialService {

	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXWZ";
		String smallLetters = capitalLetters.toLowerCase();
		String numbers = "1234567890";
		String splChars = "~!@#$%^&*()_+{}[];:<>,.";

		String values = capitalLetters + smallLetters + numbers + splChars;
		char[] password = new char[8];
		Random r = new Random();
		for (int i = 0; i < password.length; i++) {
			password[i] = values.charAt(r.nextInt(values.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName, String department) {
		return firstName + "." + lastName + "@" + department + ".ankitsolution.com";
	}

	public void showCredentials(Employee employee, String email, char[] generatedPassword) {
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email    ---> " + email);
		String password = new String(generatedPassword);
		System.out.println("Password ---> " + password);
	}
}
