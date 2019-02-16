package com.employee.dto;

import java.sql.Time;
import java.util.Date;

public class EmployeeClockInClockOutDTO {
	

	private Time clockInTime;

	public Time getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(Time clockInTime) {
		this.clockInTime = clockInTime;
	}

	public Time getClockOutTime() {
		return clockOutTime;
	}

	public void setClockOutTime(Time clockOutTime) {
		this.clockOutTime = clockOutTime;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	private Time clockOutTime;

	private int empId;
	

}
