package com.autocare.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class BookingDetails implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int bookingID;

	private Customer customer;

	private CarDetails car;

	private List<ServiceAvailable> serviceNames;

	private Timestamp created;
	private Timestamp updated;
	private char status;

	public BookingDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookingDetails(int bookingID, Customer customer, CarDetails car, List<ServiceAvailable> serviceNames,
			Timestamp created, Timestamp updated, char status) {
		super();
		this.bookingID = bookingID;
		this.customer = customer;
		this.car = car;
		this.serviceNames = serviceNames;
		this.created = created;
		this.updated = updated;
		this.status = status;
	}

	public BookingDetails(Customer customer, CarDetails car, List<ServiceAvailable> serviceNames, Timestamp created,
			Timestamp updated, char status) {
		super();
		this.customer = customer;
		this.car = car;
		this.serviceNames = serviceNames;
		this.created = created;
		this.updated = updated;
		this.status = status;
	}

	public int getBookingID() {
		return bookingID;
	}

	public void setBookingID(int bookingID) {
		this.bookingID = bookingID;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public CarDetails getCar() {
		return car;
	}

	public void setCar(CarDetails car) {
		this.car = car;
	}

	public List<ServiceAvailable> getServiceNames() {
		return serviceNames;
	}

	public void setServiceNames(List<ServiceAvailable> serviceNames) {
		this.serviceNames = serviceNames;
	}

	public Timestamp getCreated() {
		return created;
	}

	public void setCreated(Timestamp created) {
		this.created = created;
	}

	public Timestamp getUpdated() {
		return updated;
	}

	public void setUpdated(Timestamp updated) {
		this.updated = updated;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookingID;
		result = prime * result + ((car == null) ? 0 : car.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((serviceNames == null) ? 0 : serviceNames.hashCode());
		result = prime * result + status;
		result = prime * result + ((updated == null) ? 0 : updated.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingDetails other = (BookingDetails) obj;
		if (bookingID != other.bookingID)
			return false;
		if (car == null) {
			if (other.car != null)
				return false;
		} else if (!car.equals(other.car))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (serviceNames == null) {
			if (other.serviceNames != null)
				return false;
		} else if (!serviceNames.equals(other.serviceNames))
			return false;
		if (status != other.status)
			return false;
		if (updated == null) {
			if (other.updated != null)
				return false;
		} else if (!updated.equals(other.updated))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingID=" + bookingID + ", customer=" + customer + ", car=" + car + ", serviceNames="
				+ serviceNames + ", created=" + created + ", updated=" + updated + ", status=" + status + "]";
	}

}
