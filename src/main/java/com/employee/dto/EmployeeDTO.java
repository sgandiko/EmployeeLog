package com.employee.dto;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDTO {
	
	private int empId;
	private String firstName;
	private String lastName;
	private String fullName;
	private String jobTitle;
	private String activeStatus;
	private String joinDate;
	private Date lastDate;
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public String getJoinDate() {
		return this.joinDate;
	}
	public void setJoinDate(Date joinDate) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
		this.joinDate = dateFormat.format(joinDate); 
	}
	public Date getLastDate() {
		return lastDate;
	}
	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}
	
	
	
}
