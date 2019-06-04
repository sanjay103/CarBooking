package com.ds.supercar.model.vehicle;

import java.util.Date;

public class Car {
	private int carid;
	private String carname;
	private String reg_number;
	private Date dateofadded;
	private Date modelyear;
	private CarType cartype;
	private FualType faultype;
	private byte availability_flag;
	
	public Car() {
	
}

	public Car(int carid, String carname, String reg_number, Date dateofadded, Date modelyear, CarType cartype,
			FualType faultype, byte availability_flag) {
		super();
		this.carid = carid;
		this.carname = carname;
		this.reg_number = reg_number;
		this.dateofadded = dateofadded;
		this.modelyear = modelyear;
		this.cartype = cartype;
		this.faultype = faultype;
		this.availability_flag = availability_flag;
	}

	public int getCarid() {
		return carid;
	}

	public void setCarid(int carid) {
		this.carid = carid;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public String getReg_number() {
		return reg_number;
	}

	public void setReg_number(String reg_number) {
		this.reg_number = reg_number;
	}

	public Date getDateofadded() {
		return dateofadded;
	}

	public void setDateofadded(Date dateofadded) {
		this.dateofadded = dateofadded;
	}

	public Date getModelyear() {
		return modelyear;
	}

	public void setModelyear(Date modelyear) {
		this.modelyear = modelyear;
	}

	public CarType getCartype() {
		return cartype;
	}

	public void setCartype(CarType cartype) {
		this.cartype = cartype;
	}

	public FualType getFaultype() {
		return faultype;
	}

	public void setFaultype(FualType faultype) {
		this.faultype = faultype;
	}

	public byte getAvailability_flag() {
		return availability_flag;
	}

	public void setAvailability_flag(byte availability_flag) {
		this.availability_flag = availability_flag;
	}
	
	

}
