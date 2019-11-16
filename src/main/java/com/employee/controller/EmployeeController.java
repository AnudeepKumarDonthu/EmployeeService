/**
 * 
 */
package com.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/pingme", produces = MediaType.TEXT_PLAIN_VALUE)
	public String pingMe() {
		System.out.println("I am in controller");
		employeeService.storeEmployee();
		return "I am available";
	}

	@RequestMapping(value = "/storeemployees", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> storeEmployees(@RequestBody Employee employee) {

		return null;
	}

	@RequestMapping(value = "/getemployees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> listEmployees() {

		return null;
	}

}
