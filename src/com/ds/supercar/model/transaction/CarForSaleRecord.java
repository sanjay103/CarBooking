package com.ds.supercar.model.transaction;

import java.util.Date;

import com.ds.supercar.model.vehicle.Car;

public class CarForSaleRecord {
	private int carforsaleid;
	private Date dateofadded;
	private String brancelocation;
	private double saleprice;
	private int speedoreading;
	private Car car;
	 public CarForSaleRecord() {	 
	 }
	public CarForSaleRecord(int carforsaleid, Date dateofadded, String brancelocation, double saleprice,
			int speedoreading, Car car) {
		super();
		this.carforsaleid = carforsaleid;
		this.dateofadded = dateofadded;
		this.brancelocation = brancelocation;
		this.saleprice = saleprice;
		this.speedoreading = speedoreading;
		this.car = car;
	}
	public int getCarforsaleid() {
		return carforsaleid;
	}
	public void setCarforsaleid(int carforsaleid) {
		this.carforsaleid = carforsaleid;
	}
	public Date getDateofadded() {
		return dateofadded;
	}
	public void setDateofadded(Date dateofadded) {
		this.dateofadded = dateofadded;
	}
	public String getBrancelocation() {
		return brancelocation;
	}
	public void setBrancelocation(String brancelocation) {
		this.brancelocation = brancelocation;
	}
	public double getSaleprice() {
		return saleprice;
	}
	public void setSaleprice(double saleprice) {
		this.saleprice = saleprice;
	}
	public int getSpeedoreading() {
		return speedoreading;
	}
	public void setSpeedoreading(int speedoreading) {
		this.speedoreading = speedoreading;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	 

}
