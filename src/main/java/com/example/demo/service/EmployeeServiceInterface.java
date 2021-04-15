package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Employee;

public interface EmployeeServiceInterface {
	
	public void createNewEmployee(Employee e);
	
	public Optional<Employee> getEmployee(Long id);
	
	public List<Employee> listEmployees();
	
	public void updateEmployee(Employee e, Long id);
	
	public void deleteEmployee(Long id);
	
	public Optional<Employee> findByDeptName(String name);

}
