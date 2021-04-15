package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService  implements EmployeeServiceInterface {
	
	@Autowired
	private EmployeeRepository repository;
	
	public void createNewEmployee(Employee e) {
		this.repository.save(e);
	}

	@Override
	public Optional<Employee> getEmployee(Long id) {
		Optional<Employee> result = this.repository.findById(id);
		return result;
	}

	@Override
	public List<Employee> listEmployees() {
		return this.repository.findAll();
	}

	@Override
	public void updateEmployee(Employee e, Long id) {
		Optional<Employee> result = this.repository.findById(id);
		if (result.isPresent()) {
			Employee employeeDB = result.get();
			employeeDB.setFirst_name(e.getFirst_name());
			employeeDB.setLast_name(e.getLast_name());
			employeeDB.setDepartment(e.getDepartment());
			this.repository.save(employeeDB);
		}
		
	}

	@Override
	public void deleteEmployee(Long id) {
		boolean exists = this.repository.existsById(id);
		if (exists) {
			this.repository.deleteById(id);
		}
		
	}

	@Override
	public Optional<Employee> findByDeptName(String name) {
		return this.repository.findByDepartmentName(name);
	}

}
