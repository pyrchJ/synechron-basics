package com.synechron.basics;

public class ArrayCRUDEx {
	// CRUD : Create, read, update, delete

	// primitive Data types / custom class (user defined class).

	public static void main(String[] args) {
		// new object created in the heap memory
		EmployeeService employeeService = new EmployeeService();

		for (int i = 1; i <= 20; i++) {
			String result = employeeService
					.addEmployee(new Employee("ab00" + i, "abhi", "chivate", "pune", 2000, "94949494"));
			System.out.println(result + i);

		}
		Employee employee = employeeService.getEmployeeById("ab005");
		System.out.println(employee);
		String result = employeeService.deleteEmployee("ab005");
		System.out.println(result);
		Employee employee2 = employeeService.getEmployeeById("ab006");
		System.out.println(employee2);

		for (Employee emp : employeeService.getAllEmployees()) {
			System.out.println(emp);

		}
		
		Employee [] empls = employeeService.getEmployeesByName("abhi");
		for(Employee employee3: empls) {
			System.out.println(employee3);
			
			// Update an employee
		    Employee updatedEmployee = new Employee("ab006", "updatedAbhi", "updatedChivate", "updatedPune", 3000, "95959595");
		    String updateResult = employeeService.updateEmployeeById("ab006", updatedEmployee);
		    System.out.println(updateResult);
		}
	}
}
