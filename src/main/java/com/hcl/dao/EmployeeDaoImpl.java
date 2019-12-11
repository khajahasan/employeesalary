package com.hcl.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		Session session = null;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		return session;
	}

	public String addEmployee(Employee employee) {
		getSession().save(employee);
		return "Employee added successfully";

	}

	public Employee employeeDetails(long empId) {
		// Employee employee = (Employee) getSession().get(Employee.class, new
		// Long(empId));
		SQLQuery query = getSession().createSQLQuery(
				"select * from employee e join salary s on e.salaryId=s.salaryId where e.empId= " + empId);
		

	}

}
