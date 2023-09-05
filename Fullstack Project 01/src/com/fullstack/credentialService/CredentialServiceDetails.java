package com.fullstack.credentialService;

import java.util.Random;

import com.fullstack.Employee.Employee;

public class CredentialServiceDetails implements ICredentialServiceDetails {

	private String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private String lower = "abcdefghijklmnopqrstuvwxyz";
	private String numbers = "0123456789";
	private String splChars = "!@#$%^&*()_+=?:";
	private String passwordChars = upper + lower + numbers + splChars ;
	private Random random = new Random();
	
	@Override
	public void generateEmail(Employee employee) {
		String emailAddress = employee.getFirstName().toLowerCase()+employee.getLastName().toLowerCase()+ "@" +employee.getDepartment()+ ".vrm.in";
		employee.setEmailAddress(emailAddress);
	}

	@Override
	public void generatePassword(Employee employee) {
		String password = "";

		for(int i=0;i<8;i++) {
			password = password + passwordChars.charAt(random.nextInt(passwordChars.length()));
		}
 // String passwordChars = "ABC..abc..012..!@#$"; char ch = data.charAt(); //random.nextInt(77) -- 0...76 -- 33

		employee.setPassword(password);
		
	}

	@Override
	public void showCredentials(Employee employee) {
		// TODO Auto-generated method stub
		System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
		System.out.println("Email --> " + employee.getEmailAddress());
		System.out.println("Password --> " + employee.getPassword());
	}

}
