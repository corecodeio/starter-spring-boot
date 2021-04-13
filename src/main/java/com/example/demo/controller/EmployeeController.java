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

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeDAO dao;
	
	@PostMapping("/employee")
	public void addEmployee(@RequestBody Employee e) {
		this.dao.create(e);
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return this.dao.list();
	}
	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable int id) {
		return this.dao.get(id);
	}
	
	@PutMapping("/employee/{id}")
	public void updateEmployee(@RequestBody Employee e, @PathVariable int id) {
		this.dao.update(e, id);
	}
	
	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable int id) {
		this.dao.delete(id);
		
	}
	
	
	

}
