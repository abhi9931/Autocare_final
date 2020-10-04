package com.autocare.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class ServiceAvailable implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int serviceID;
	private String serviceName;
	private String serviceType;
	private BigDecimal serviceCost;
	private char status;
	private Timestamp created;
	private Timestamp updated;
	private int createdBY;

	public ServiceAvailable() {
		// TODO Auto-generated constructor stub
	}

	public ServiceAvailable(int serviceID, String serviceName, String serviceType, BigDecimal serviceCost, char status,
			Timestamp created, Timestamp updated, int createdBY) {
		super();
		this.serviceID = serviceID;
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.serviceCost = serviceCost;
		this.status = status;
		this.created = created;
		this.updated = updated;
		this.createdBY = createdBY;
	}

	public ServiceAvailable(String serviceName, String serviceType, BigDecimal serviceCost, char status, Timestamp created,
			Timestamp updated, int createdBY) {
		super();
		this.serviceName = serviceName;
		this.serviceType = serviceType;
		this.serviceCost = serviceCost;
		this.status = status;
		this.created = created;
		this.updated = updated;
		this.createdBY = createdBY;
	}

	public int getServiceID() {
		return serviceID;
	}

	public void setServiceID(int serviceID) {
		this.serviceID = serviceID;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public BigDecimal getServiceCost() {
		return serviceCost;
	}

	public void setServiceCost(BigDecimal serviceCost) {
		this.serviceCost = serviceCost;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
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

	public int getCreatedBY() {
		return createdBY;
	}

	public void setCreatedBY(int createdBY) {
		this.createdBY = createdBY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + createdBY;
		result = prime * result + ((serviceCost == null) ? 0 : serviceCost.hashCode());
		result = prime * result + serviceID;
		result = prime * result + ((serviceName == null) ? 0 : serviceName.hashCode());
		result = prime * result + ((serviceType == null) ? 0 : serviceType.hashCode());
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
		ServiceAvailable other = (ServiceAvailable) obj;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (createdBY != other.createdBY)
			return false;
		if (serviceCost == null) {
			if (other.serviceCost != null)
				return false;
		} else if (!serviceCost.equals(other.serviceCost))
			return false;
		if (serviceID != other.serviceID)
			return false;
		if (serviceName == null) {
			if (other.serviceName != null)
				return false;
		} else if (!serviceName.equals(other.serviceName))
			return false;
		if (serviceType == null) {
			if (other.serviceType != null)
				return false;
		} else if (!serviceType.equals(other.serviceType))
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
		return "ServiceNames [serviceID=" + serviceID + ", serviceName=" + serviceName + ", serviceType=" + serviceType
				+ ", serviceCost=" + serviceCost + ", status=" + status + ", created=" + created + ", updated="
				+ updated + ", createdBY=" + createdBY + "]";
	}

}
