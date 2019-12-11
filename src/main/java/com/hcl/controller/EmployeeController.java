package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Employee;
import com.hcl.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public String addEmployee(Employee employee) {
		employeeService.addEmployee(employee);
		return "Employee added successfully";
	}

	@RequestMapping(value = "/details", method = RequestMethod.GET)
	public Employee employeeDetails(long empId) {
		return employeeService.employeeDetails(empId);
	}

}
