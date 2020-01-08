package com.employee.model;

public class Employee {

	private Integer id;
	private Integer salary;
	private String firstName;
	private String lastName;
	private String email;
	
	
	
	
	public Employee(Integer id, Integer salary, String firstName, String lastName, String email) {
		this.id = id;
		this.salary = salary;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee [id=" + id + ", salary "+salary+", firstName=" + firstName + ",lastName=" + lastName + ", email=" + email + "]";
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
