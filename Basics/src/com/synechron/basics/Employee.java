package com.synechron.basics;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {

	private String empId;
	private String empFirstName;
	private String empLastName;
	private String empAddress;
	private float empSalary;
	private String empContactNumber;
}
	
	
	//private will not allow anyone to access the field/method outside of a class - e.g fridge
	//if someone needs access to private, how do we provide it? - Getters and Setters via public method
	//public : we can access it anywhere
	
	
	
	
	

