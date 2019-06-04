package com.ds.supercar.model.payment;

import java.util.Date;

public class DemandDraft {
	private String ddnumber;
	private String bankname;
	private String brance; 
	private double amount;
	private Date deposite_date;
	private Date expire_date;
	private Payment payment; //many to one.(need to add payment address not to add payment id)
	public DemandDraft() {

}
	public DemandDraft(String ddnumber, String bankname, String brance, double amount, Date deposite_date,
			Date expire_date, Payment payment) {
		super();
		this.ddnumber = ddnumber;
		this.bankname = bankname;
		this.brance = brance;
		this.amount = amount;
		this.deposite_date = deposite_date;
		this.expire_date = expire_date;
		this.payment = payment;
	}
	public String getDdnumber() {
		return ddnumber;
	}
	public void setDdnumber(String ddnumber) {
		this.ddnumber = ddnumber;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBrance() {
		return brance;
	}
	public void setBrance(String brance) {
		this.brance = brance;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public Date getDeposite_date() {
		return deposite_date;
	}
	public void setDeposite_date(Date deposite_date) {
		this.deposite_date = deposite_date;
	}
	public Date getExpire_date() {
		return expire_date;
	}
	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
