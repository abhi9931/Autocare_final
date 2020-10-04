package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SUSPENSION")
public class Suspension {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "suspensionId")
	private int suspensionId;

	@Column(name = "sfp")
	private String sfp;

	@Column(name = "sbwlrb")
	private String sbwlrb;

	@Column(name = "tre")
	private String tre;

	@Column(name = "sb")
	private String sb;

	@Column(name = "ualw")
	private String ualw;

	@Column(name = "sbr")
	private String sbr;

	@Column(name = "bj")
	private String bj;

	@Column(name = "sa")
	private String sa;

	@Column(name = "tsj")
	private String tsj;

	@Column(name = "cvj")
	private String cvj;

	@Column(name = "rsb")
	private String rsb;
	
	public Suspension() {}

	public Suspension(int suspensionId, String sfp, String sbwlrb, String tre, String sb, String ualw, String sbr,
			String bj, String sa, String tsj, String cvj, String rsb) {
		super();
		this.suspensionId = suspensionId;
		this.sfp = sfp;
		this.sbwlrb = sbwlrb;
		this.tre = tre;
		this.sb = sb;
		this.ualw = ualw;
		this.sbr = sbr;
		this.bj = bj;
		this.sa = sa;
		this.tsj = tsj;
		this.cvj = cvj;
		this.rsb = rsb;
	}
	
	public Suspension(String sfp, String sbwlrb, String tre, String sb, String ualw, String sbr,
			String bj, String sa, String tsj, String cvj, String rsb) {
		super();
		this.sfp = sfp;
		this.sbwlrb = sbwlrb;
		this.tre = tre;
		this.sb = sb;
		this.ualw = ualw;
		this.sbr = sbr;
		this.bj = bj;
		this.sa = sa;
		this.tsj = tsj;
		this.cvj = cvj;
		this.rsb = rsb;
	}

	public int getSuspensionId() {
		return suspensionId;
	}

	public void setSuspensionId(int suspensionId) {
		this.suspensionId = suspensionId;
	}

	public String getSfp() {
		return sfp;
	}

	public void setSfp(String sfp) {
		this.sfp = sfp;
	}

	public String getSbwlrb() {
		return sbwlrb;
	}

	public void setSbwlrb(String sbwlrb) {
		this.sbwlrb = sbwlrb;
	}

	public String getTre() {
		return tre;
	}

	public void setTre(String tre) {
		this.tre = tre;
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public String getUalw() {
		return ualw;
	}

	public void setUalw(String ualw) {
		this.ualw = ualw;
	}

	public String getSbr() {
		return sbr;
	}

	public void setSbr(String sbr) {
		this.sbr = sbr;
	}

	public String getBj() {
		return bj;
	}

	public void setBj(String bj) {
		this.bj = bj;
	}

	public String getSa() {
		return sa;
	}

	public void setSa(String sa) {
		this.sa = sa;
	}

	public String getTsj() {
		return tsj;
	}

	public void setTsj(String tsj) {
		this.tsj = tsj;
	}

	public String getCvj() {
		return cvj;
	}

	public void setCvj(String cvj) {
		this.cvj = cvj;
	}

	public String getRsb() {
		return rsb;
	}

	public void setRsb(String rsb) {
		this.rsb = rsb;
	}

	@Override
	public String toString() {
		return suspensionId + "\t" + sfp + "\t" + sbwlrb + "\t" + tre
				+ "\t" + sb + "\t" + ualw + "\t" + sbr + "\t" + bj + "\t" + sa + "\t" + tsj
				+ "\t" + cvj + "\t" + rsb;
	}
	
}
