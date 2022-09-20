/**
 * 
 */
package com.gl.service;

import java.util.Random;

import com.gl.bean.Employee;

/**
 * @author 91963
 *
 */
public class CredentialService {

	public String passwordGenerator() {
		 String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[4];

	      password[2] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[0] = numbers.charAt(random.nextInt(numbers.length()));
	   
	     
	      StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < password.length; i++) {
	            sb.append(password[i]);
	        }
	      return sb.toString();
	   }
		
	

	public String generateEmailAddress(Employee employee, String dept) {
		String email = employee.getfName() + employee.getlName() + "@" + dept + ".company.com";
		return email;
	}

	public void showCredentials(String email, String password) {
		System.out.println("Email ---> " + email);
		System.out.println("Password ---> " + password);

	}

}
