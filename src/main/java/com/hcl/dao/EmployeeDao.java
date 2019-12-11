package com.hcl.dao;

import com.hcl.entity.Employee;

public interface EmployeeDao {
	public String addEmployee(Employee employee);

	public Employee employeeDetails(long empId);

}
