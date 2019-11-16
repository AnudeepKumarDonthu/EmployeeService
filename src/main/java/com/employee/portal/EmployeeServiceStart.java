package com.employee.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Anudeep Kumar
 * Employee Management Service
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.employee"})
public class EmployeeServiceStart 
{
    public static void main( String[] args )
    {
        SpringApplication.run(EmployeeServiceStart.class, args);
    }
}
