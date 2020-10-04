package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIGHT")
public class Light {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "lightId")
	private int lightId;

	@Column(name = "ho")
	private String ho;

	@Column(name = "hbi")
	private String hbi;

	@Column(name = "ptl")
	private String ptl;

	@Column(name = "tsfr")
	private String tsfr;

	@Column(name = "sc")
	private String sc;

	@Column(name = "bl")
	private String bl;

	@Column(name = "lpl")
	private String lpl;

	@Column(name = "rl")
	private String rl;

	@Column(name = "alc")
	private String alc;

	public Light() {
		super();
	}

	public Light(String ho, String hbi, String ptl, String tsfr, String sc, String bl, String lpl, String rl,
			String alc) {
		super();
		this.ho = ho;
		this.hbi = hbi;
		this.ptl = ptl;
		this.tsfr = tsfr;
		this.sc = sc;
		this.bl = bl;
		this.lpl = lpl;
		this.rl = rl;
		this.alc = alc;
	}

	public Light(int lightId, String ho, String hbi, String ptl, String tsfr, String sc, String bl, String lpl,
			String rl, String alc) {
		super();
		this.lightId = lightId;
		this.ho = ho;
		this.hbi = hbi;
		this.ptl = ptl;
		this.tsfr = tsfr;
		this.sc = sc;
		this.bl = bl;
		this.lpl = lpl;
		this.rl = rl;
		this.alc = alc;
	}

	public int getLightId() {
		return lightId;
	}

	public void setLightId(int lightId) {
		this.lightId = lightId;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getHbi() {
		return hbi;
	}

	public void setHbi(String hbi) {
		this.hbi = hbi;
	}

	public String getPtl() {
		return ptl;
	}

	public void setPtl(String ptl) {
		this.ptl = ptl;
	}

	public String getTsfr() {
		return tsfr;
	}

	public void setTsfr(String tsfr) {
		this.tsfr = tsfr;
	}

	public String getSc() {
		return sc;
	}

	public void setSc(String sc) {
		this.sc = sc;
	}

	public String getBl() {
		return bl;
	}

	public void setBl(String bl) {
		this.bl = bl;
	}

	public String getLpl() {
		return lpl;
	}

	public void setLpl(String lpl) {
		this.lpl = lpl;
	}

	public String getRl() {
		return rl;
	}

	public void setRl(String rl) {
		this.rl = rl;
	}

	public String getAlc() {
		return alc;
	}

	public void setAlc(String alc) {
		this.alc = alc;
	}

	@Override
	public String toString() {
		return "Light [lightId=" + lightId + ", ho=" + ho + ", hbi=" + hbi + ", ptl=" + ptl + ", tsfr=" + tsfr + ", sc="
				+ sc + ", bl=" + bl + ", lpl=" + lpl + ", rl=" + rl + ", alc=" + alc + "]";
	}
	
	
}
