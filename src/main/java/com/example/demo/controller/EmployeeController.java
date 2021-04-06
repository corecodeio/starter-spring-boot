package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO dao;
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee e) {
		this.dao.addEmployee(e);
		return e;
	}
	
	@GetMapping("/employee")
	public ArrayList<Employee> getEmployees() {
		return this.dao.getEmployees();
	}

}
