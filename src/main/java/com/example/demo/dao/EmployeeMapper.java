package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee employee = new Employee();
		employee.setId(rs.getInt("id"));
		employee.setFirst_name(rs.getString("first_name"));
		employee.setLast_name(rs.getString("last_name"));
		employee.setDepartment(rs.getString("department"));
		
		return employee;
	}
	
	

}
