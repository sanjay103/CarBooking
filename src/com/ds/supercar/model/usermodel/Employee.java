package com.ds.supercar.model.usermodel;

import java.util.Date;

import com.ds.supercar.model.places.Branch;

public class Employee extends User {
	private Date joindate;
	private String role;
	private Branch branch;
	public Date getJoindate() {
		return joindate;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	} 
	

}
