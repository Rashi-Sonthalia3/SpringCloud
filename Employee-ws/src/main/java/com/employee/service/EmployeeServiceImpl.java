package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.controller.EmployeeController;
import com.employee.model.Employee;
import com.employee.repo.IEmployeeRepository;
import com.employee.util.Constants;
import com.employee.util.DataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class EmployeeServiceImpl implements IEmployeeService{
	
	private static final Logger logger = LogManager.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	IEmployeeRepository employeeRepository;

	@Override
	public void Create(Employee emp) {
		
		logger.debug(emp.toString());
		employeeRepository.save(emp);
		
		
	}

	@Override
	public Employee Retrieve(Long id) {
		Employee emp =  employeeRepository.findById(id).orElseThrow(()->new DataException(id));
		logger.debug(emp.toString());
		return emp;
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		List<Employee> emp = employeeRepository.findAll();
		System.out.println("Getting data from DB : " + emp);
		if(emp.isEmpty())
		{
			
			throw new DataException("DATA_NOT_FOUND");
			
		}
		else
			return emp;
	}
	
	
	

}
