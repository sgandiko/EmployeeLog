package com.employee.entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="EmployeeId")
	private int empid;
	
	@Column(name="FirstName")
	private String firstName;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="JobTitle")
	private String jobTitle;
	
	@Column(name="IsActive")
	private int isActive;
	
	@Column(name="JoinDate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date joinDate;
	
	@Column(name="LastDate")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date lastDate;
	
	// One to Many mapping using List
	@OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
	private List<EmployeeLog> empLog;
	
	/*@OneToMany(mappedBy="employee", cascade = CascadeType.ALL)
	private List<EmployeeWorkTimings> empWorkTimings;*/
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public WorkTimings getWorkTimings() {
		return workTimings;
	}

	public void setWorkTimings(WorkTimings workTimings) {
		this.workTimings = workTimings;
	}*/

	public Employee(int empid, String firstName, String lastName, String jobTitle, int isActive, Date joinDate,
			Date lastDate) {
		super();
		this.empid = empid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.jobTitle = jobTitle;
		this.isActive = isActive;
		this.joinDate = joinDate;
		this.lastDate = lastDate;
	}
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getFullName() {
		return this.firstName+" "+this.lastName;
	}
	
	public String getactiveStatus() {
		if(this.isActive == 1) {
			return "Active";
		}else {
			return "InActive";
		}
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

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", firstName=" + firstName + ", lastName=" + lastName + ", jobTitle="
				+ jobTitle + ", isActive=" + isActive + ", joinDate=" + joinDate + ", lastDate=" + lastDate + "]";
	}
	
	

}
