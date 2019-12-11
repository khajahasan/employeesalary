package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.entity.Salary;
import com.hcl.service.SalaryService;

@RequestMapping("/salary")
@RestController
public class SalaryController {

	@Autowired
	SalaryService salaryService;

	@RequestMapping(value = "/salary", method = RequestMethod.POST)

	public String addSalary(Salary salary) {
		salaryService.addSalary(salary);
		return "Salary details added successfully";
	}

}
