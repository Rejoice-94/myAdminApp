/**
 * @author Rejoice
 *
 */
package com.myAdmin.server.service;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myAdmin.server.model.Employee;
import com.myAdmin.server.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> eList = employeeRepository.findAll();

		Collections.sort(eList, Comparator.comparing(Employee::getFirstName));
		return eList;
	}

	@Override
	public Employee addEmployee(Employee employee) {
		
		return employeeRepository.save(employee);
	}

}
