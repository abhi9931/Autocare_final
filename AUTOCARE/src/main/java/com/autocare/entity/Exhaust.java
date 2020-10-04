package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EXHAUST")
public class Exhaust {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "exhaustId")
	private int exhaustId;

	@Column(name = "epf")
	private String epf;

	@Column(name = "mrp")
	private String mrp;

	@Column(name = "ccv")
	private String ccv;

	@Column(name = "pfv")
	private String pfv;

	@Column(name = "sh")
	private String sh;

	public Exhaust() {
		super();
	}

	public Exhaust(String epf, String mrp, String ccv, String pfv, String sh) {
		super();
		this.epf = epf;
		this.mrp = mrp;
		this.ccv = ccv;
		this.pfv = pfv;
		this.sh = sh;
	}

	public Exhaust(int exhaustId, String epf, String mrp, String ccv, String pfv, String sh) {
		super();
		this.exhaustId = exhaustId;
		this.epf = epf;
		this.mrp = mrp;
		this.ccv = ccv;
		this.pfv = pfv;
		this.sh = sh;
	}

	public int getExhaustId() {
		return exhaustId;
	}

	public void setExhaustId(int exhaustId) {
		this.exhaustId = exhaustId;
	}

	public String getEpf() {
		return epf;
	}

	public void setEpf(String epf) {
		this.epf = epf;
	}

	public String getMrp() {
		return mrp;
	}

	public void setMrp(String mrp) {
		this.mrp = mrp;
	}

	public String getCcv() {
		return ccv;
	}

	public void setCcv(String ccv) {
		this.ccv = ccv;
	}

	public String getPfv() {
		return pfv;
	}

	public void setPfv(String pfv) {
		this.pfv = pfv;
	}

	public String getSh() {
		return sh;
	}

	public void setSh(String sh) {
		this.sh = sh;
	}

	@Override
	public String toString() {
		return exhaustId + "\t" + epf + "\t" + mrp + "\t" + ccv + "\t" + pfv
				+ "\t" + sh;
	}
	
	
}
