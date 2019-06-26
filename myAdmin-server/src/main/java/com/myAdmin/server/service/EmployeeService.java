/**
 * @author Rejoice
 *
 */
package com.myAdmin.server.service;

import java.util.List;

import com.myAdmin.server.model.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee addEmployee(Employee e);

}
