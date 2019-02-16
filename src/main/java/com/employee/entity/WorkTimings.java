package com.employee.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="workTimings")
public class WorkTimings {
	
	public WorkTimings() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public WorkTimings(int workTimingsId, Date clockInTime, Date clockOutTime) {
		super();
		this.workTimingsId = workTimingsId;
		this.clockInTime = clockInTime;
		this.clockOutTime = clockOutTime;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int workTimingsId;
	
	@Column(name="ClockInTime")
	@Temporal(TemporalType.TIME)
	private java.util.Date clockInTime;
	
	@Column(name="ClockOutTime")
	@Temporal(TemporalType.TIME)
	private java.util.Date clockOutTime;
	
	/*@OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
	private List<EmployeeWorkTimings> empWorkTimings;*/

	
	public int getWorkTimingsId() {
		return workTimingsId;
	}

	public void setWorkTimingsId(int workTimingsId) {
		this.workTimingsId = workTimingsId;
	}

	public java.util.Date getClockInTime() {
		return clockInTime;
	}

	public void setClockInTime(java.util.Date clockInTime) {
		this.clockInTime = clockInTime;
	}

	public java.util.Date getClockOutTime() {
		return clockOutTime;
	}

	public void setClockOutTime(java.util.Date clockOutTime) {
		this.clockOutTime = clockOutTime;
	}
	
}
