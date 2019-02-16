package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="status")
public class Status {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="StatusId")
	private int statusId;
	
	@Column(name="StatusName")
	private int statusName;
	
	@Column(name="StatusType")
	private int statusType;
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getStatusName() {
		return statusName;
	}

	public void setStatusName(int statusName) {
		this.statusName = statusName;
	}

	public int getStatusType() {
		return statusType;
	}

	public void setStatusType(int statusType) {
		this.statusType = statusType;
	}
	
}
