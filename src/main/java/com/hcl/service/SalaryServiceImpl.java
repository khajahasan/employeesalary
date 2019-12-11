package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.dao.SalaryDao;
import com.hcl.entity.Salary;

@Repository
public class SalaryServiceImpl implements SalaryService {

	@Autowired
	SalaryDao salaryDao;

	public String addSalary(Salary salary) {
		salaryDao.addSalary(salary);
		return "salary details added successfully";
	}

}
