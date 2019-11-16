/**
 * 
 */
package com.employee.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.model.Employee;

/**
 * @author Anudeep Kumar
 *
 */
@Repository
@Transactional

public class EmployeeRepository {

	private static final Logger logger = LoggerFactory.getLogger(EmployeeRepository.class);

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Employee storeEmployee(Employee employee) {
		logger.info("Storing Employee object :: " + employee);
		Session session = this.sessionFactory.getCurrentSession();
		session.save(employee);
		return employee;
	}

	public List<Employee> getEmployees() {
		logger.info("Get complete Employee details :: ");
		Session session = this.sessionFactory.getCurrentSession();
		Criteria allEmployesCriteria=session.createCriteria(Employee.class);
		List<Employee> allEmployes=allEmployesCriteria.list();
		return allEmployes;
	}

}
