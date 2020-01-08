package com.employee.dao;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;
import com.employee.model.Employees;

@Repository
public class EmployeeDAO {

	private static Employees list = new Employees();

	static {
		list.getEmployeeList().add(new Employee(1, 50000, "Mayur", "Ingle", "inglemayur88900@gmail.com"));
		list.getEmployeeList().add(new Employee(2, 50000, "Rajiv", "Makhijani", "rj@gmail.com"));
		list.getEmployeeList().add(new Employee(3, 50000, "Pankaj", "Tandure", "pt@gmail.com"));
	}

	public Employees getAllEmployees() {
		return list;
	}
	
	public void addEmployee(Employee emp) {
		 list.getEmployeeList().add(emp);
		
	}
}
