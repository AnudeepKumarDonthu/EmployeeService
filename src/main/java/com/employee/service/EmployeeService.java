/**
 * 
 */
package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRepository;

/**
 * @author Anudeep Kumar
 *
 */
@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public Employee storeEmployee() {
		Employee employee = new Employee();
		System.out.println("I am in Employee Service");
		boolean persistStatus = employeeRepository.storeEmployee(employee);
		return employee;
	}
}
