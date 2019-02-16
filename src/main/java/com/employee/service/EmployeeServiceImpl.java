package com.employee.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.dao.EmployeeDAO;
import com.employee.dto.EmployeeClockInClockOutDTO;
import com.employee.dto.EmployeeDTO;
import com.employee.dto.EmployeeLogDTO;
import com.employee.entity.Customer;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeLog;
import com.employee.entity.WorkTimings;
import com.employee.util.EmployeeUtil;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@Transactional
	public List<EmployeeDTO> getEmployees() {
		List<Employee> employees = employeeDAO.getEmployees();
		return EmployeeUtil.ConvertToViewModelEmployeeList(employees);
		
	}
	
	@Override
	@Transactional
	public void saveEmployee(Employee employee) {
		employeeDAO.saveEmployee(employee);
	}
	
	@Override
	@Transactional
	public void saveEmployeeLogs(List<EmployeeClockInClockOutDTO> employeeLogs) {
		List<EmployeeLog> empLogList = new ArrayList<EmployeeLog>();
		for(EmployeeClockInClockOutDTO log : employeeLogs) {
			Employee emp = employeeDAO.getEmployee(log.getEmpId());
			EmployeeLog empLog = new EmployeeLog();
			empLog.setClockInstatus(1);
			empLog.setClockOutstatus(1);
			empLog.setEmployee(emp);
			//empLog.setClockInTime();
			//empLog.setClockOutTime();
			empLogList.add(empLog);
		}
		employeeDAO.saveEmployeeLog(empLogList);
	}
	
	@Override
	@Transactional
	public List<EmployeeLogDTO> getEmployeesLog() {
		List<EmployeeLog> empLogs = employeeDAO.getEmployeesLog();
		return EmployeeUtil.ConvertToViewModelList(empLogs);
	}

	

	@Override
	@Transactional
	public Employee getEmployee(int employeeId) {
		return employeeDAO.getEmployee(employeeId);
	}


	@Override
	@Transactional
	public void deleteCustomer(int custid) {
		employeeDAO.deleteCustomer(custid);		
	}


	@Override
	@Transactional
	public List<EmployeeDTO> searchEmployee(String theSearchName) {
		List<Employee> emp = employeeDAO.searchEmployee(theSearchName);
			return ConvertToViewModelSearchList(emp);
		}

		private List<EmployeeDTO> ConvertToViewModelSearchList(List<Employee> employee) {
			// TODO Auto-generated method stub
			List<EmployeeDTO> viewList = new ArrayList<EmployeeDTO>();
			for(Employee emp : employee) {
				viewList.add(ConvertToViewSearchModel(emp));
			}
			return viewList;
		}

		private EmployeeDTO ConvertToViewSearchModel(Employee emp) {
			// TODO Auto-generated method stub
			EmployeeDTO model = new EmployeeDTO();
			model.setEmpId(emp.getEmpid());
			model.setFirstName(emp.getFirstName());
			model.setLastName(emp.getLastName());
			model.setJobTitle(emp.getJobTitle());
			if(emp.getIsActive() == 1) {
				model.setActiveStatus("Active");
			}else {
				model.setActiveStatus("InActive");
			}
			model.setJoinDate(emp.getJoinDate());
			model.setLastDate(emp.getLastDate());
			return model;
			
		}
}

	

