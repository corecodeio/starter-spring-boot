package com.example.demo.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;
import com.example.demo.model.EmployeeList;

@Repository
public class EmployeeDAO {
	
	@Autowired
	private static EmployeeList list;
	
	public void addEmployee(Employee e) {
		list.addEmployee(e);
	}
	
	public ArrayList<Employee> getEmployees() {
		return list.get();
	}

}
