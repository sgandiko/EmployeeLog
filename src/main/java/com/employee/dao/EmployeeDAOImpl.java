package com.employee.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.dto.EmployeeLogDTO;
import com.employee.entity.Customer;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeLog;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Employee> getEmployees() {
		
		//get the current session
		Session session = sessionFactory.getCurrentSession();
		
		// create a query to get the customers
		Query<Employee> query = session.createQuery("from Employee as e order by empid",Employee.class);
		// execute the query and get the list
		List<Employee> employees = query.getResultList();
		//return the list
		return employees;
	}

	@Override
	public void saveEmployee(Employee employee) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(employee);
		
	}
	
	@Override
	public void saveEmployeeLog(List<EmployeeLog> employeeLogs) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(employeeLogs);
		
	}
	
	@Override
	public List<EmployeeLog> getEmployeesLog() {
		
		//get the current session
		Session session = sessionFactory.getCurrentSession();
		
		// create a query to get the customers
		Query<EmployeeLog> query = session.createQuery("from EmployeeLog order by id",EmployeeLog.class);
		// execute the query and get the list
		List<EmployeeLog> empLogs = query.getResultList();
		System.out.println(empLogs.size());
		for(EmployeeLog emp : empLogs) {
			System.out.println(emp);
		}
		//return the list
		
		return empLogs;
	}

	
	@Override
	public Employee getEmployee(int employeeId) {
		Session session = sessionFactory.getCurrentSession();
		Employee employee = session.get(Employee.class,employeeId);
		return employee;
	}

	@Override
	public void deleteCustomer(int custid) {
		Session session = sessionFactory.getCurrentSession();
		/*Customer cust = session.get(Customer.class,custid);
		session.delete(cust)*/;
		
		Query theQuery = session.createQuery("delete from Customer where id = :customerId");
		theQuery.setParameter("customerId", custid);
		
		theQuery.executeUpdate();
	}

	@Override
	public List<Employee> searchEmployee(String theSearchName) {
		Session session = sessionFactory.getCurrentSession();
		Query theQuery;
		 if (theSearchName != null && theSearchName.trim().length() > 0) {

	            // search for firstName or lastName ... case insensitive
	           theQuery =session.createQuery("from Employee where lower(firstName) like :theName or lower(lastName) like :theName", Employee.class);
	            theQuery.setParameter("theName", "%" + theSearchName.toLowerCase() + "%");

	        }
	        else {
	            // theSearchName is empty ... so just get all customers
	            theQuery =session.createQuery("from Employee", Employee.class);            
	        }
	        
	        // execute query and get result list
	        List<Employee> employees = theQuery.getResultList();
	                
	        // return the results        
	        return employees;
	        
	    }

}
