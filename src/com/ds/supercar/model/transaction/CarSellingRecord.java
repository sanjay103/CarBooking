package com.ds.supercar.model.transaction;

import java.util.Date;

import com.ds.supercar.model.payment.Payment;
import com.ds.supercar.model.usermodel.User;

public class CarSellingRecord {
	
		private int carseleid;
		private User user;
		private Payment payment;
		private Date dateofsale;
		private CarForSaleRecord carForSaleRecord;
		
		public  CarSellingRecord() {
		}

		public CarSellingRecord(int carseleid, User user, Payment payment, Date dateofsale,
				CarForSaleRecord carForSaleRecord) {
			super();
			this.carseleid = carseleid;
			this.user = user;
			this.payment = payment;
			this.dateofsale = dateofsale;
			this.carForSaleRecord = carForSaleRecord;
		}

		public int getCarseleid() {
			return carseleid;
		}

		public void setCarseleid(int carseleid) {
			this.carseleid = carseleid;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Payment getPayment() {
			return payment;
		}

		public void setPayment(Payment payment) {
			this.payment = payment;
		}

		public Date getDateofsale() {
			return dateofsale;
		}

		public void setDateofsale(Date dateofsale) {
			this.dateofsale = dateofsale;
		}

		public CarForSaleRecord getCarForSaleRecord() {
			return carForSaleRecord;
		}

		public void setCarForSaleRecord(CarForSaleRecord carForSaleRecord) {
			this.carForSaleRecord = carForSaleRecord;
		}
		
		

}
