/**
 * 
 */
package com.employee.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

/**
 * @author Anudeep Kumar
 *
 */
@RestController
public class EmployeeController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/pingme", produces = MediaType.TEXT_PLAIN_VALUE)
	public String pingMe() {
		logger.info("Application is Available!!!");
		return "I am available";
	}

	@RequestMapping(value = "/storeemployees", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> storeEmployees(@RequestBody Employee employee) {
		logger.info("Received Request to Store the new Employee!!!");
		employee=employeeService.storeEmployee(employee);
		return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	}

	@RequestMapping(value = "/getemployees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> listEmployees() {
		logger.info("Received Request to Retrive all Employee details!!!");
		List<Employee> employessList=employeeService.retriveEmployee();
		return new ResponseEntity<List<Employee>>(employessList, HttpStatus.OK);
	}

}
