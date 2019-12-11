package com.hcl.service;

import com.hcl.entity.Employee;

public interface EmployeeService {

	public String addEmployee(Employee employee);

	public Employee employeeDetails(long empId);

}
