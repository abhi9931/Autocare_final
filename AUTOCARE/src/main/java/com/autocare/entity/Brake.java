package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BRAKE")
public class Brake {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "brakeId")
	private int brakeId;

	@Column(name = "dvabp")
	private String dvabp;

	@Column(name = "bpt")
	private String bpt;

	@Column(name = "plp")
	private String plp;

	@Column(name = "lbb")
	private String lbb;

	@Column(name = "bbvh")
	private String bbvh;

	@Column(name = "mcfl")
	private String mcfl;

	@Column(name = "bfc")
	private String bfc;

	@Column(name = "mclm")
	private String mclm;

	@Column(name = "bwlo")
	private String bwlo;

	@Column(name = "hlo")
	private String hlo;

	@Column(name = "slo")
	private String slo;

	public Brake() {
		super();
	}

	public Brake(String dvabp, String bpt, String plp, String lbb, String bbvh, String mcfl, String bfc, String mclm,
			String bwlo, String hlo, String slo) {
		super();
		this.dvabp = dvabp;
		this.bpt = bpt;
		this.plp = plp;
		this.lbb = lbb;
		this.bbvh = bbvh;
		this.mcfl = mcfl;
		this.bfc = bfc;
		this.mclm = mclm;
		this.bwlo = bwlo;
		this.hlo = hlo;
		this.slo = slo;
	}

	public Brake(int brakeId, String dvabp, String bpt, String plp, String lbb, String bbvh, String mcfl, String bfc,
			String mclm, String bwlo, String hlo, String slo) {
		super();
		this.brakeId = brakeId;
		this.dvabp = dvabp;
		this.bpt = bpt;
		this.plp = plp;
		this.lbb = lbb;
		this.bbvh = bbvh;
		this.mcfl = mcfl;
		this.bfc = bfc;
		this.mclm = mclm;
		this.bwlo = bwlo;
		this.hlo = hlo;
		this.slo = slo;
	}

	public int getBrakeId() {
		return brakeId;
	}

	public void setBrakeId(int brakeId) {
		this.brakeId = brakeId;
	}

	public String getDvabp() {
		return dvabp;
	}

	public void setDvabp(String dvabp) {
		this.dvabp = dvabp;
	}

	public String getBpt() {
		return bpt;
	}

	public void setBpt(String bpt) {
		this.bpt = bpt;
	}

	public String getPlp() {
		return plp;
	}

	public void setPlp(String plp) {
		this.plp = plp;
	}

	public String getLbb() {
		return lbb;
	}

	public void setLbb(String lbb) {
		this.lbb = lbb;
	}

	public String getBbvh() {
		return bbvh;
	}

	public void setBbvh(String bbvh) {
		this.bbvh = bbvh;
	}

	public String getMcfl() {
		return mcfl;
	}

	public void setMcfl(String mcfl) {
		this.mcfl = mcfl;
	}

	public String getBfc() {
		return bfc;
	}

	public void setBfc(String bfc) {
		this.bfc = bfc;
	}

	public String getMclm() {
		return mclm;
	}

	public void setMclm(String mclm) {
		this.mclm = mclm;
	}

	public String getBwlo() {
		return bwlo;
	}

	public void setBwlo(String bwlo) {
		this.bwlo = bwlo;
	}

	public String getHlo() {
		return hlo;
	}

	public void setHlo(String hlo) {
		this.hlo = hlo;
	}

	public String getSlo() {
		return slo;
	}

	public void setSlo(String slo) {
		this.slo = slo;
	}

	@Override
	public String toString() {
		return brakeId + "\t" + dvabp + "\t" + bpt + "\t" + plp + "\t" + lbb
				+ "\t" + bbvh + "\t" + mcfl + "\t" + bfc + "\t" + mclm + "\t" + bwlo 
				+ "\t" + hlo + "\t" + slo;
	}
	
	
}
