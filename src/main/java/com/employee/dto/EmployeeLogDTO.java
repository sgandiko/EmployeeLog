package com.employee.dto;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.employee.entity.Employee;

public class EmployeeLogDTO {

	public EmployeeLogDTO() {
		super();
	}
	
	public EmployeeLogDTO(int id, Date clockInTime, Date clockOutTime, int empId, String fullName, String clockInstatus,
			String clockOutstatus, Date empClockInTime, Date empClockOutTime) {
		super();
		this.id = id;
		this.clockInTime = clockInTime;
		this.clockOutTime = clockOutTime;
		this.empId = empId;
		this.fullName = fullName;
		this.clockInstatus = clockInstatus;
		this.clockOutstatus = clockOutstatus;
		this.empClockInTime = empClockInTime;
		this.empClockOutTime = empClockOutTime;
	}

	private int id;

	private Date clockInTime;

	private Date clockOutTime;

	private int empId;
	
	private String fullName;

	private String clockInstatus;

	private String clockOutstatus;

	private java.util.Date empClockInTime;

	private java.util.Date empClockOutTime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(Date clockInTime) {
		this.clockInTime = clockInTime;
	}

	public Date getClockOutTime() {
		return clockOutTime;
	}

	public void setClockOutTime(Date clockOutTime) {
		this.clockOutTime = clockOutTime;
	}

	public String getClockInstatus() {
		return clockInstatus;
	}

	public void setClockInstatus(String clockInstatus) {
		this.clockInstatus = clockInstatus;
	}

	public String getClockOutstatus() {
		return clockOutstatus;
	}

	public void setClockOutstatus(String clockOutstatus) {
		this.clockOutstatus = clockOutstatus;
	}

	public java.util.Date getEmpClockInTime() {
		return empClockInTime;
	}

	public void setEmpClockInTime(java.util.Date empClockInTime) {
		this.empClockInTime = empClockInTime;
	}

	public java.util.Date getEmpClockOutTime() {
		return empClockOutTime;
	}

	public void setEmpClockOutTime(java.util.Date empClockOutTime) {
		this.empClockOutTime = empClockOutTime;
	}

	

}
