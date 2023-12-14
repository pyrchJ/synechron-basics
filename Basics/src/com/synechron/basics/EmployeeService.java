package com.synechron.basics;

public class EmployeeService {

	private Employee employees[] = new Employee[10];

	private static int count = -1;
	// static is only 1 & centralised copy.

	public String addEmployee(Employee employee) {

		// 1. If array is full then it should increase the size
		// automatically
		// 2. It should not allow a null employee details.
		if (employee != null) {
			count++;
			if (count < employees.length) {
				// allow to add it
				// count = -1+1
				// count = 0; array index begin with 0
				employees[count] = employee;
				return "success";
			} else {// once list is full we increase its size if record not null
				// we should increase size of arr
				System.out.println();
				Employee temp[] = new Employee[employees.length * 2];
				// do we need to copy the content from employees to new array (temp)?
				// ^copy it to employees to temp

				// we can use for loop or predefined methods from java

				System.arraycopy(employees, 0, temp, 0, count);
				// ^System.arraycopy(Object src, int srcPos, Object dest, int destPos, int
				// length)
				// Object src : source array
				// int srcPos : start location from source to do the copy work
				// Object dest : dest array (where we want to copy the content)
				// int destPost : start pos for destination array
				// ^int length : no of elements to be copied from src to dest)

				employees = temp;
				employees[count] = employee;
				return "success";

			}
		} else {
			return "not a valid entry";
		}

	}

	// Method to delete an employee - can't delete stuff from an array so need to
	// simulate deletion

	public String deleteEmployee(String id) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmpId().equals(id)) {
				employees[i] = null;
				return "success";
			}
		}
		return "fail";

	}

	public Employee getEmployeeById(String id) {
		for (Employee employee : employees) {
			if (employee != null && employee.getEmpId().equals(id))
				return employee;
		}
		return null;
	}

	// return all employees
	public Employee[] getAllEmployees() {
		return employees;
	}

	// return all employees on the basis of name
	public Employee[] getEmployeesByName(String name) {
		Employee[] temp = new Employee[employees.length];
		int counter = -1;

		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && name.equals(employees[i].getEmpFirstName())) {
				temp[++counter] = employees[i];
			}
		}
		return temp;
	}
	//assignment for updating employees 
	public String updateEmployeeById(String id, Employee updatedEmployee) {
	    for (int i = 0; i < employees.length; i++) {
	        if (employees[i] != null && employees[i].getEmpId().equals(id)) {
	            employees[i] = updatedEmployee;
	            return "success";
	        }
	    }
	    return "fail";
	}
	

	}


