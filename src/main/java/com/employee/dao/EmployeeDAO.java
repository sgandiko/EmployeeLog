package com.employee.dao;

import java.util.List;

import com.employee.dto.EmployeeLogDTO;
import com.employee.entity.Customer;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeLog;

public interface EmployeeDAO {
	
	public List<Employee> getEmployees();

	public void saveEmployee(Employee employee);
	
	public void saveEmployeeLog(List<EmployeeLog> employeeLog);
	
	public List<EmployeeLog> getEmployeesLog();

	public Employee getEmployee(int employeeId);

	public void deleteCustomer(int custid);

	public List<Employee> searchEmployee(String theSearchName);

}
