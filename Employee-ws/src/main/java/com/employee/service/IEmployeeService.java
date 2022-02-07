package com.employee.service;

import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;

public interface IEmployeeService {

	void Create(Employee emp);

	Employee Retrieve(Long id);

	List<Employee> getEmployees();
}
