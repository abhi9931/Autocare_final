package com.autocare.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

public class Parts implements Serializable, Cloneable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int partID;
	private String partName;
	private String description;
	private BigDecimal unitCost;
	private Timestamp created;
	private Timestamp updated;
	private int count;

	public Parts() {
		// TODO Auto-generated constructor stub
	}

	public Parts(int partID, String partName, String description, BigDecimal unitCost, Timestamp created,
			Timestamp updated, int count) {
		super();
		this.partID = partID;
		this.partName = partName;
		this.description = description;
		this.unitCost = unitCost;
		this.created = created;
		this.updated = updated;
		this.count = count;
	}

	public Parts(String partName, String description, BigDecimal unitCost, Timestamp created, Timestamp updated,
			int count) {
		super();
		this.partName = partName;
		this.description = description;
		this.unitCost = unitCost;
		this.created = created;
		this.updated = updated;
		this.count = count;
	}

	public int getPartID() {
		return partID;
	}

	public void setPartID(int partID) {
		this.partID = partID;
	}

	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(BigDecimal unitCost) {
		this.unitCost = unitCost;
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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((created == null) ? 0 : created.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + partID;
		result = prime * result + ((partName == null) ? 0 : partName.hashCode());
		result = prime * result + ((unitCost == null) ? 0 : unitCost.hashCode());
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
		Parts other = (Parts) obj;
		if (count != other.count)
			return false;
		if (created == null) {
			if (other.created != null)
				return false;
		} else if (!created.equals(other.created))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (partID != other.partID)
			return false;
		if (partName == null) {
			if (other.partName != null)
				return false;
		} else if (!partName.equals(other.partName))
			return false;
		if (unitCost == null) {
			if (other.unitCost != null)
				return false;
		} else if (!unitCost.equals(other.unitCost))
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
		return "Parts [partID=" + partID + ", partName=" + partName + ", description=" + description + ", unitCost="
				+ unitCost + ", created=" + created + ", updated=" + updated + ", count=" + count + "]";
	}

}
