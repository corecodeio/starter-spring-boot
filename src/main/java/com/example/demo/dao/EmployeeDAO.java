package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

@Repository
public class EmployeeDAO implements DAO<Employee> {
	
	@Autowired
	private JdbcTemplate jdbTemplate;

	@Override
	public List<Employee> list() {
		String sql = "SELECT id, first_name, last_name, department from employee";
		return this.jdbTemplate.query(sql, new EmployeeMapper());
	}

	@Override
	public void create(Employee t) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO employee (first_name, last_name, department) values (?, ?, ?)";
		this.jdbTemplate.update(sql, t.getFirst_name(), t.getLast_name(), t.getDepartment());
	}

	@Override
	public Optional<Employee> get(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT id, first_name, last_name, department from employee where id = ?";
		Employee employee = null;
		try {
			employee = this.jdbTemplate.queryForObject(sql, new EmployeeMapper(), id);
		} catch (Exception e) {
			
		}
		return Optional.ofNullable(employee);
	}

	@Override
	public void update(Employee t, int id) {
		// TODO Auto-generated method stub
		String sql = "UPDATE employee set first_name = ?, last_name = ?, department = ? where id = ?";
		this.jdbTemplate.update(sql, t.getFirst_name(), t.getLast_name(), t.getDepartment(), id);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		String sql = "DELETE from employee where id = ?";
		this.jdbTemplate.update(sql, id);
		
	}
	
	
	

}
