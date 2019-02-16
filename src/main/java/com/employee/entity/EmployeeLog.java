package com.employee.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employeeLog")
public class EmployeeLog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="EmployeeId") //empid as foreign key
	private Employee employee;
	
	
	@Column(name="ClockInTime")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date clockInTime;
	
	@Column(name="ClockOutTime")
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSS")
	private Date clockOutTime;
	
	@Column(name="ClockInStatus")
	private int clockInstatus;
	
	@Column(name="ClockOutStatus")
	private int clockOutstatus;
	
	@Column(name="EmpClockInTime")
	@Temporal(TemporalType.TIME)
	private java.util.Date empClockInTime;
	
	@Column(name="EmpClockOutTime")
	@Temporal(TemporalType.TIME)
	private java.util.Date empClockOutTime;

	public EmployeeLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeLog(int id, Employee employee, Date clockInTime, Date clockOutTime, int clockInstatus,
			int clockOutstatus, Date empClockInTime, Date empClockOutTime) {
		super();
		this.id = id;
		this.employee = employee;
		this.clockInTime = clockInTime;
		this.clockOutTime = clockOutTime;
		this.clockInstatus = clockInstatus;
		this.clockOutstatus = clockOutstatus;
		this.empClockInTime = empClockInTime;
		this.empClockOutTime = empClockOutTime;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getClockInstatus() {
		return clockInstatus;
	}

	public void setClockInstatus(int clockInstatus) {
		this.clockInstatus = clockInstatus;
	}

	public int getClockOutstatus() {
		return clockOutstatus;
	}

	public void setClockOutstatus(int clockOutstatus) {
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

	@Override
	public String toString() {
		return "EmployeeLog [id=" + id + ", employee=" + employee + ", clockInTime=" + clockInTime + ", clockOutTime="
				+ clockOutTime + ", clockInstatus=" + clockInstatus + ", clockOutstatus=" + clockOutstatus
				+ ", empClockInTime=" + empClockInTime + ", empClockOutTime=" + empClockOutTime + "]";
	}

}