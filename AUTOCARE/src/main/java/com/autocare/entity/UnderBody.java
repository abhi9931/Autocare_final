package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNDER_BODY")
public class UnderBody {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "underBodyId")
	private int underBodyId;

	@Column(name = "dareo")
	private String dareo;

	@Column(name = "rof")
	private String rof;

	@Column(name = "eol")
	private String eol;

	@Column(name = "goll")
	private String goll;

	@Column(name = "dol")
	private String dol;

	@Column(name = "lswa")
	private String lswa;

	@Column(name = "flla")
	private String flla;

	@Column(name = "bchl")
	private String bchl;

	@Column(name = "emgb")
	private String emgb;

	public UnderBody() {
		super();
	}

	public UnderBody(int underBodyId, String dareo, String rof, String eol, String goll, String dol, String lswa,
			String flla, String bchl, String emgb) {
		super();
		this.underBodyId = underBodyId;
		this.dareo = dareo;
		this.rof = rof;
		this.eol = eol;
		this.goll = goll;
		this.dol = dol;
		this.lswa = lswa;
		this.flla = flla;
		this.bchl = bchl;
		this.emgb = emgb;
	}

	public UnderBody(String dareo, String rof, String eol, String goll, String dol, String lswa, String flla,
			String bchl, String emgb) {
		super();
		this.dareo = dareo;
		this.rof = rof;
		this.eol = eol;
		this.goll = goll;
		this.dol = dol;
		this.lswa = lswa;
		this.flla = flla;
		this.bchl = bchl;
		this.emgb = emgb;
	}

	public int getUnderBodyId() {
		return underBodyId;
	}

	public void setUnderBodyId(int underBodyId) {
		this.underBodyId = underBodyId;
	}

	public String getDareo() {
		return dareo;
	}

	public void setDareo(String dareo) {
		this.dareo = dareo;
	}

	public String getRof() {
		return rof;
	}

	public void setRof(String rof) {
		this.rof = rof;
	}

	public String getEol() {
		return eol;
	}

	public void setEol(String eol) {
		this.eol = eol;
	}

	public String getGoll() {
		return goll;
	}

	public void setGoll(String goll) {
		this.goll = goll;
	}

	public String getDol() {
		return dol;
	}

	public void setDol(String dol) {
		this.dol = dol;
	}

	public String getLswa() {
		return lswa;
	}

	public void setLswa(String lswa) {
		this.lswa = lswa;
	}

	public String getFlla() {
		return flla;
	}

	public void setFlla(String flla) {
		this.flla = flla;
	}

	public String getBchl() {
		return bchl;
	}

	public void setBchl(String bchl) {
		this.bchl = bchl;
	}

	public String getEmgb() {
		return emgb;
	}

	public void setEmgb(String emgb) {
		this.emgb = emgb;
	}

	@Override
	public String toString() {
		return underBodyId + "\t" + dareo + "\t" + rof + "\t" + eol
				+ "\t" + goll + "\t" + dol + "\t" + lswa + "\t" + flla + "\t" + bchl + "\t" + emgb;
	}
	
	
}
