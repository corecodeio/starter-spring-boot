package com.example.demo.model;

public class Employee {
	
	private Integer id;
	private String first_name;
	private String last_name;
	private String department;
	
	public Employee(Integer id, String first_name, String last_name, String department) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.department = department;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", department="
				+ department + "]";
	}
	
	
	
	
	
	

}
