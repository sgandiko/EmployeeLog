package com.employee.service;

import java.util.List;

import com.employee.dto.EmployeeClockInClockOutDTO;
import com.employee.dto.EmployeeDTO;
import com.employee.dto.EmployeeLogDTO;
import com.employee.entity.Customer;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeLog;

public interface EmployeeService {
	
	public List<EmployeeDTO> getEmployees();

	public void saveEmployee(Employee employee);
	
	public void saveEmployeeLogs(List<EmployeeClockInClockOutDTO> employeeLogs);
	
	public List<EmployeeLogDTO> getEmployeesLog();

	public Employee getEmployee(int employeeId);

	public void deleteCustomer(int custid);

	public List<EmployeeDTO> searchEmployee(String theSearchName);

}
