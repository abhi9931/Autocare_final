package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMISSION")
public class Emission {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emmissionId")
	private int emmissionId;

	@Column(name = "hpib")
	private String hpib;

	@Column(name = "hpia")
	private String hpia;

	@Column(name = "hpcb")
	private String hpcb;

	@Column(name = "hpca")
	private String hpca;

	@Column(name = "cib")
	private String cib;

	@Column(name = "cia")
	private String cia;

	@Column(name = "ccb")
	private String ccb;

	@Column(name = "cca")
	private String cca;

	@Column(name = "oib")
	private String oib;

	@Column(name = "oia")
	private String oia;

	@Column(name = "ocb")
	private String ocb;

	@Column(name = "oca")
	private String oca;

	@Column(name = "lube")
	private String lube;

	public Emission() {
		super();
	}

	public Emission(String hpib, String hpia, String hpcb, String hpca, String cib, String cia, String ccb, String cca,
			String oib, String oia, String ocb, String oca, String lube) {
		super();
		this.hpib = hpib;
		this.hpia = hpia;
		this.hpcb = hpcb;
		this.hpca = hpca;
		this.cib = cib;
		this.cia = cia;
		this.ccb = ccb;
		this.cca = cca;
		this.oib = oib;
		this.oia = oia;
		this.ocb = ocb;
		this.oca = oca;
		this.lube = lube;
	}

	public Emission(int emmissionId, String hpib, String hpia, String hpcb, String hpca, String cib, String cia,
			String ccb, String cca, String oib, String oia, String ocb, String oca, String lube) {
		super();
		this.emmissionId = emmissionId;
		this.hpib = hpib;
		this.hpia = hpia;
		this.hpcb = hpcb;
		this.hpca = hpca;
		this.cib = cib;
		this.cia = cia;
		this.ccb = ccb;
		this.cca = cca;
		this.oib = oib;
		this.oia = oia;
		this.ocb = ocb;
		this.oca = oca;
		this.lube = lube;
	}

	public int getEmmissionId() {
		return emmissionId;
	}

	public void setEmmissionId(int emmissionId) {
		this.emmissionId = emmissionId;
	}

	public String getHpib() {
		return hpib;
	}

	public void setHpib(String hpib) {
		this.hpib = hpib;
	}

	public String getHpia() {
		return hpia;
	}

	public void setHpia(String hpia) {
		this.hpia = hpia;
	}

	public String getHpcb() {
		return hpcb;
	}

	public void setHpcb(String hpcb) {
		this.hpcb = hpcb;
	}

	public String getHpca() {
		return hpca;
	}

	public void setHpca(String hpca) {
		this.hpca = hpca;
	}

	public String getCib() {
		return cib;
	}

	public void setCib(String cib) {
		this.cib = cib;
	}

	public String getCia() {
		return cia;
	}

	public void setCia(String cia) {
		this.cia = cia;
	}

	public String getCcb() {
		return ccb;
	}

	public void setCcb(String ccb) {
		this.ccb = ccb;
	}

	public String getCca() {
		return cca;
	}

	public void setCca(String cca) {
		this.cca = cca;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getOia() {
		return oia;
	}

	public void setOia(String oia) {
		this.oia = oia;
	}

	public String getOcb() {
		return ocb;
	}

	public void setOcb(String ocb) {
		this.ocb = ocb;
	}

	public String getOca() {
		return oca;
	}

	public void setOca(String oca) {
		this.oca = oca;
	}

	public String getLube() {
		return lube;
	}

	public void setLube(String lube) {
		this.lube = lube;
	}

	@Override
	public String toString() {
		return emmissionId + "\t" + hpib + "\t" + hpia + "\t" + hpcb
				+ "\t" + hpca + "\t" + cib + "\t" + cia + "\t" + ccb + "\t" + cca + "\t" + oib
				+ "\t" + oia + "\t" + ocb + "\t" + oca + "\t" + lube;
	}
	
	
}
