package com.lms.demo.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
	@Table(name = "order_details")
	public class Order implements Serializable {

	 private static final long serialVersionUID = 1L;

	@Id @GeneratedValue(generator="system-uuid")
	 @GenericGenerator(name="system-uuid", strategy = "uuid")
	 @Column(name = "booking_id")
	 private String booking_id;
	 
	 
	 @Column(name = "ISBN")
	 private String ISBN;
	 
	 @Column(name = "booking_date")
	 private Date booking_date;

	public String getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(String booking_id) {
		this.booking_id = booking_id;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public Date getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(Date booking_date) {
		this.booking_date = booking_date;
	}

	@Override
	public String toString() {
		return "Order [booking_id=" + booking_id + ", ISBN=" + ISBN + ", booking_date=" + booking_date + "]";
	}
	 
	 
}
