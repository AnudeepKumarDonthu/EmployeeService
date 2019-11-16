/**
 * 
 */
package com.employee.repository;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

/**
 * @author Anudeep Kumar
 *
 */
@Repository
public class EmployeeRepository {

	public boolean storeEmployee(Employee employee) {
		System.out.println("I am in Employee Repository");
		return true;
	}

}
