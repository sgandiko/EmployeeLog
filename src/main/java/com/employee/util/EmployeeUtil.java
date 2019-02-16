package com.employee.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.dao.EmployeeDAO;
import com.employee.dto.EmployeeDTO;
import com.employee.dto.EmployeeLogDTO;
import com.employee.entity.Employee;
import com.employee.entity.EmployeeLog;

public class EmployeeUtil {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	
	public static List<EmployeeDTO> ConvertToViewModelEmployeeList(List<Employee> employees) {
		// TODO Auto-generated method stub
		List<EmployeeDTO> viewList = new ArrayList<EmployeeDTO>();
		for(Employee emp : employees) {
			viewList.add(ConvertToViewEmployeeModel(emp));
		}
		return viewList;
	}

	public static EmployeeDTO ConvertToViewEmployeeModel(Employee emp) {
		// TODO Auto-generated method stub
		EmployeeDTO model = new EmployeeDTO();
		model.setEmpId(emp.getEmpid());
		model.setFirstName(emp.getFirstName());
		model.setLastName(emp.getLastName());
		model.setFullName(emp.getFullName());
		model.setJobTitle(emp.getJobTitle());
		model.setActiveStatus(emp.getactiveStatus());
		model.setJoinDate(emp.getJoinDate());
		model.setLastDate(emp.getLastDate());
		return model;
		
	}
	
	public static List<EmployeeLogDTO> ConvertToViewModelList(List<EmployeeLog> empLogs) {
		// TODO Auto-generated method stub
		List<EmployeeLogDTO> viewList = new ArrayList<EmployeeLogDTO>();
		for(EmployeeLog emp : empLogs) {
			viewList.add(ConvertToViewModel(emp));
		}
		return viewList;
	}

	public static EmployeeLogDTO ConvertToViewModel(EmployeeLog empLog) {
		// TODO Auto-generated method stub
		List<String> loginLogoutStatus = new ArrayList<String>();
		loginLogoutStatus.add("Arrived Early");
		loginLogoutStatus.add("On Time");
		loginLogoutStatus.add("Arrived Late");
		loginLogoutStatus.add("Over Time");
		loginLogoutStatus.add("Left Early");
		loginLogoutStatus.add("Not Yet In");
		loginLogoutStatus.add("Still In");
		EmployeeLogDTO model = new EmployeeLogDTO();
		model.setId(empLog.getId());
		model.setClockInTime(empLog.getClockInTime());
		model.setClockOutTime(empLog.getClockOutTime());
		model.setEmpClockInTime(empLog.getEmpClockInTime());
		model.setEmpClockOutTime(empLog.getEmpClockOutTime());
		model.setFullName(empLog.getEmployee().getFullName());
		model.setEmpId(empLog.getEmployee().getEmpid());
		model.setClockInstatus(loginLogoutStatus.get(empLog.getClockInstatus()-1));
		model.setClockOutstatus(loginLogoutStatus.get(empLog.getClockOutstatus()-1));
		return model;
		
	}
	

}
