package com.fullstack.credentialService;

import com.fullstack.Employee.Employee;

public interface ICredentialServiceDetails {
	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
}
