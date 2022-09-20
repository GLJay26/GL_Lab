package com.gl.exe;

import java.util.Scanner;

import com.gl.bean.Employee;
import com.gl.service.CredentialService;

public class SuppAdm {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Employee First name");

		String fNme = scanner.nextLine(); // Read user input
		System.out.println("Enter Employee Last name");
		String lNme = scanner.nextLine(); // Read user input
		Employee employee = new Employee(fNme, lNme);

		System.out.println("Please select from the following department :");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("1. Legal");

		String dept = scanner.nextLine();

		switch (dept) {
		case "1":
			dept = "tech";
			break;
		case "2":
			dept = "admn";
			break;
		case "3":
			dept = "hr";
			break;
		case "4":
			dept = "legal";
			break;
		}

		CredentialService service = new CredentialService();
		String paswrd = service.passwordGenerator();
		String email = service.generateEmailAddress(employee, dept);
		String str = "Dear"+ fNme +"your generated credentials are as follows";
		System.out.println("Dear Harshit your generated credentials are as follows");
		service.showCredentials(email, paswrd);

	}

}
