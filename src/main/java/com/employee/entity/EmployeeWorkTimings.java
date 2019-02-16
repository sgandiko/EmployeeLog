package com.employee.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/*@Entity
@Table(name="employeeWorkTimings")*/
public class EmployeeWorkTimings {
	
	/*@Id
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="EmployeeId") //empid as foreign key
	private Employee employee;
	
	@ManyToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="WorkTimingId") //empid as foreign key
	private WorkTimings workTimings;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public WorkTimings getWorkTimings() {
		return workTimings;
	}

	public void setWorkTimings(WorkTimings workTimings) {
		this.workTimings = workTimings;
	}

	public EmployeeWorkTimings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public EmployeeWorkTimings(Employee employee, WorkTimings workTimings) {
		super();
		this.employee = employee;
		this.workTimings = workTimings;
	}*/
	
	

}
