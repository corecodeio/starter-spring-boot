package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee e) {
		this.service.createNewEmployee(e);
	}
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return this.service.listEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable Long id) {
		return  this.service.getEmployee(id);
	}
	
	@PutMapping("/employee/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable Long id) {
		this.service.updateEmployee(e, id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable Long id) {
		this.service.deleteEmployee(id);
	}
	
	@GetMapping("/employee/department/{name}")
	public Optional<Employee> getEmployeeByDepartment(@PathVariable String name) {
		return this.service.findByDeptName(name);
	}
	
	
	

}
