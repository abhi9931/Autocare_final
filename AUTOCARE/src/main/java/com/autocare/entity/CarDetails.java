package com.autocare.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class CarDetails implements Serializable, Cloneable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int carID;
	private String make;
	private Timestamp carYear;
	private String rego;
	private String model;
	private String modelType;
	private String transmission;
	private String vehicleNote;
	private int cylinder;

	public CarDetails() {
		// TODO Auto-generated constructor stub
	}

	public CarDetails(int carID, String make, Timestamp carYear, String rego, String model, String modelType,
			String transmission, String vehicleNote, int cylinder) {
		super();
		this.carID = carID;
		this.make = make;
		this.carYear = carYear;
		this.rego = rego;
		this.model = model;
		this.modelType = modelType;
		this.transmission = transmission;
		this.vehicleNote = vehicleNote;
		this.cylinder = cylinder;
	}

	public CarDetails(String make, Timestamp carYear, String rego, String model, String modelType, String transmission,
			String vehicleNote, int cylinder) {
		super();
		this.make = make;
		this.carYear = carYear;
		this.rego = rego;
		this.model = model;
		this.modelType = modelType;
		this.transmission = transmission;
		this.vehicleNote = vehicleNote;
		this.cylinder = cylinder;
	}

	public int getCarID() {
		return carID;
	}

	public void setCarID(int carID) {
		this.carID = carID;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public Timestamp getCarYear() {
		return carYear;
	}

	public void setCarYear(Timestamp carYear) {
		this.carYear = carYear;
	}

	public String getRego() {
		return rego;
	}

	public void setRego(String rego) {
		this.rego = rego;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getModelType() {
		return modelType;
	}

	public void setModelType(String modelType) {
		this.modelType = modelType;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getVehicleNote() {
		return vehicleNote;
	}

	public void setVehicleNote(String vehicleNote) {
		this.vehicleNote = vehicleNote;
	}

	public int getCylinder() {
		return cylinder;
	}

	public void setCylinder(int cylinder) {
		this.cylinder = cylinder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carID;
		result = prime * result + ((carYear == null) ? 0 : carYear.hashCode());
		result = prime * result + cylinder;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((modelType == null) ? 0 : modelType.hashCode());
		result = prime * result + ((rego == null) ? 0 : rego.hashCode());
		result = prime * result + ((transmission == null) ? 0 : transmission.hashCode());
		result = prime * result + ((vehicleNote == null) ? 0 : vehicleNote.hashCode());
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
		CarDetails other = (CarDetails) obj;
		if (carID != other.carID)
			return false;
		if (carYear == null) {
			if (other.carYear != null)
				return false;
		} else if (!carYear.equals(other.carYear))
			return false;
		if (cylinder != other.cylinder)
			return false;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (modelType == null) {
			if (other.modelType != null)
				return false;
		} else if (!modelType.equals(other.modelType))
			return false;
		if (rego == null) {
			if (other.rego != null)
				return false;
		} else if (!rego.equals(other.rego))
			return false;
		if (transmission == null) {
			if (other.transmission != null)
				return false;
		} else if (!transmission.equals(other.transmission))
			return false;
		if (vehicleNote == null) {
			if (other.vehicleNote != null)
				return false;
		} else if (!vehicleNote.equals(other.vehicleNote))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarDetails [carID=" + carID + ", make=" + make + ", carYear=" + carYear + ", rego=" + rego + ", model="
				+ model + ", modelType=" + modelType + ", transmission=" + transmission + ", vehicleNote=" + vehicleNote
				+ ", cylinder=" + cylinder + "]";
	}

}
