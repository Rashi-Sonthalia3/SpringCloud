package com.employee.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.employee.controller.EmployeeController;
import com.employee.model.Employee;
import com.employee.service.IEmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger logger = LogManager.getLogger(EmployeeController.class);

	@Autowired
	private IEmployeeService employeeService;

	@GetMapping("/retrieve/{id}")
	public ResponseEntity<Employee> Retrieve(@PathVariable("id") long id) {
		logger.debug("Inside Retrieve function");
		Employee employee = employeeService.Retrieve(id);
		logger.debug(employee.toString());
		return new ResponseEntity<>(employee,HttpStatus.OK);

	}

	@PostMapping("/create")
	public Long Create(@RequestBody Employee employee) {

		employeeService.Create(employee);
		logger.debug(employee.toString());

		return employee.getId();

	}

	@GetMapping("/fetchAll")
	public ResponseEntity<List<Employee>> getAllEmployees() {
		try {
			List<Employee> list = employeeService.getEmployees();

			logger.debug("Printing data");

			list.forEach(x -> logger.debug(x.toString()));

			if (list.isEmpty() || list.size() == 0) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
