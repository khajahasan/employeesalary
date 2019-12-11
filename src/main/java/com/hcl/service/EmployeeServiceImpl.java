package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.dao.EmployeeDao;
import com.hcl.entity.Employee;

@Repository
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao employeeDao;

	public String addEmployee(Employee employee) {
		employeeDao.addEmployee(employee);

		return "Employee added successfully";
	}

	public Employee employeeDetails(long empId) {
		return employeeDao.employeeDetails(empId);

	}

}
