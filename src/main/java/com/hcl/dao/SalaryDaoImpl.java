package com.hcl.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Salary;

@Repository
public class SalaryDaoImpl implements SalaryDao {

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

	public String addSalary(Salary salary) {
		getSession().save(salary);
		return "Salary details added successfully";
	}

}
