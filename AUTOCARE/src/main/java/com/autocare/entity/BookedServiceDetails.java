package com.autocare.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

public class BookedServiceDetails implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int serviceDetailsID;
	private BookingDetails bookingDetails;
	private char status;
	private List<ServiceAvailable> serviceNameList;
	private List<Parts> partsAddedList;
	private CarDetails carDetails;
	private Timestamp created;
	private Timestamp updated;

	public BookedServiceDetails() {
		// TODO Auto-generated constructor stub
	}

	public BookedServiceDetails(int serviceDetailsID, BookingDetails bookingDetails, char status,
			List<ServiceAvailable> serviceNameList, List<Parts> partsAddedList, CarDetails carDetails, Timestamp created,
			Timestamp updated) {
		super();
		this.serviceDetailsID = serviceDetailsID;
		this.bookingDetails = bookingDetails;
		this.status = status;
		this.serviceNameList = serviceNameList;
		this.partsAddedList = partsAddedList;
		this.carDetails = carDetails;
		this.created = created;
		this.updated = updated;
	}

	public BookedServiceDetails(BookingDetails bookingDetails, char status, List<ServiceAvailable> serviceNameList,
			List<Parts> partsAddedList, CarDetails carDetails, Timestamp created, Timestamp updated) {
		super();
		this.bookingDetails = bookingDetails;
		this.status = status;
		this.serviceNameList = serviceNameList;
		this.partsAddedList = partsAddedList;
		this.carDetails = carDetails;
		this.created = created;
		this.updated = updated;
	}

	public int getServiceDetailsID() {
		return serviceDetailsID;
	}

	public void setServiceDetailsID(int serviceDetailsID) {
		this.serviceDetailsID = serviceDetailsID;
	}

	public BookingDetails getBookingDetails() {
		return bookingDetails;
	}

	public void setBookingDetails(BookingDetails bookingDetails) {
		this.bookingDetails = bookingDetails;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public List<ServiceAvailable> getServiceNameList() {
		return serviceNameList;
	}

	public void setServiceNameList(List<ServiceAvailable> serviceNameList) {
		this.serviceNameList = serviceNameList;
	}

	public List<Parts> getPartsAddedList() {
		return partsAddedList;
	}

	public void setPartsAddedList(List<Parts> partsAddedList) {
		this.partsAddedList = partsAddedList;
	}

	public CarDetails getCarDetails() {
		return carDetails;
	}

	public void setCarDetails(CarDetails carDetails) {
		this.carDetails = carDetails;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookingDetails == null) ? 0 : bookingDetails.hashCode());
		result = prime * result + ((carDetails == null) ? 0 : carDetails.hashCode());
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((partsAddedList == null) ? 0 : partsAddedList.hashCode());
		result = prime * result + serviceDetailsID;
		result = prime * result + ((serviceNameList == null) ? 0 : serviceNameList.hashCode());
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
		BookedServiceDetails other = (BookedServiceDetails) obj;
		if (bookingDetails == null) {
			if (other.bookingDetails != null)
				return false;
		} else if (!bookingDetails.equals(other.bookingDetails))
			return false;
		if (carDetails == null) {
			if (other.carDetails != null)
				return false;
		} else if (!carDetails.equals(other.carDetails))
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (partsAddedList == null) {
			if (other.partsAddedList != null)
				return false;
		} else if (!partsAddedList.equals(other.partsAddedList))
			return false;
		if (serviceDetailsID != other.serviceDetailsID)
			return false;
		if (serviceNameList == null) {
			if (other.serviceNameList != null)
				return false;
		} else if (!serviceNameList.equals(other.serviceNameList))
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
		return "ServiceDetails [serviceDetailsID=" + serviceDetailsID + ", bookingDetails=" + bookingDetails
				+ ", status=" + status + ", serviceNameList=" + serviceNameList + ", partsAddedList=" + partsAddedList
				+ ", carDetails=" + carDetails + ", created=" + created + ", updated=" + updated + "]";
	}

}
