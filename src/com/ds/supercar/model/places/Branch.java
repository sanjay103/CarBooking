package com.ds.supercar.model.places;

public class Branch {
	private int branceid;
	private String name;
	private String contact;
	private String faxnumber;
	public Branch() {
}
	public Branch(int branceid, String name, String contact, String faxnumber) {
		super();
		this.branceid = branceid;
		this.name = name;
		this.contact = contact;
		this.faxnumber = faxnumber;
	}
	public int getBranceid() {
		return branceid;
	}
	public void setBranceid(int branceid) {
		this.branceid = branceid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getFaxnumber() {
		return faxnumber;
	}
	public void setFaxnumber(String faxnumber) {
		this.faxnumber = faxnumber;
	}
	

}
