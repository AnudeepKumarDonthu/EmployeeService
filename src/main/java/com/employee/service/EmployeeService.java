/**
 * 
 */
package com.employee.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.controller.EmployeeController;
import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

/**
 * @author Anudeep Kumar
 *
 */
@Service
public class EmployeeService {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee storeEmployee(Employee employee) {
		Employee storedEmployee = null;
		if (employee.getFirstName() != null && employee.getLastName() != null && employee.getGender() != null
				&& employee.getDepartment() != null && employee.getDob() != null) {
			logger.info("Received Employee details validated for empty and proceed to store in the DB");
			storedEmployee = employeeRepository.storeEmployee(employee);
		}
		return storedEmployee;
	}

	public List<Employee> retriveEmployee() {
		logger.info("Retrive All Employees details!!!");
		List<Employee> employeeList = employeeRepository.getEmployees();
		return employeeList;
	}
}
