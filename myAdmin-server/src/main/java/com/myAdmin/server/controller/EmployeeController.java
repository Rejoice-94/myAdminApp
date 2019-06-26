/**
 * @author Rejoice
 *
 */
package com.myAdmin.server.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myAdmin.server.model.Employee;
import com.myAdmin.server.service.EmployeeServiceImplementation;

//------Web Request Handler--------//

@RestController
@RequestMapping(value = "/admin/api/")
public class EmployeeController {

	@Autowired
	EmployeeServiceImplementation employeeServiceImp;

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {

		return employeeServiceImp.getAllEmployees();
	}

	@PostMapping("/employee")
	public Employee registerEmployee(@Valid @RequestBody Employee employee) {
		return employeeServiceImp.addEmployee(employee);
	}
}
