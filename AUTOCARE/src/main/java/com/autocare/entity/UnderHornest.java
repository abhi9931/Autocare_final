package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UNDER_HORNEST")
public class UnderHornest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "underHornestId")
	private int underHornestId;

	@Column(name = "reo")
	private String reo;

	@Column(name = "blt")
	private String blt;

	@Column(name = "ac")
	private String ac;

	@Column(name = "belts")
	private String belts;

	@Column(name = "cambelt")
	private String cambelt;

	@Column(name = "cc")
	private String cc;

	@Column(name = "cevcoc")
	private String cevcoc;

	@Column(name = "smcoffl")
	private String smcoffl;

	@Column(name = "pshoefac")
	private String pshoefac;

	@Column(name = "atolacc")
	private String atolacc;

	@Column(name = "bcfl")
	private String bcfl;

	@Column(name = "wwota")
	private String wwota;

	@Column(name = "ffvo")
	private String ffvo;

	@Column(name = "pcs")
	private String pcs;

	@Column(name = "bblo")
	private String bblo;

	public UnderHornest() {
		super();
	}

	public UnderHornest(String reo, String blt, String ac, String belts, String cambelt, String cc, String cevcoc,
			String smcoffl, String pshoefac, String atolacc, String bcfl, String wwota, String ffvo, String pcs,
			String bblo) {
		super();
		this.reo = reo;
		this.blt = blt;
		this.ac = ac;
		this.belts = belts;
		this.cambelt = cambelt;
		this.cc = cc;
		this.cevcoc = cevcoc;
		this.smcoffl = smcoffl;
		this.pshoefac = pshoefac;
		this.atolacc = atolacc;
		this.bcfl = bcfl;
		this.wwota = wwota;
		this.ffvo = ffvo;
		this.pcs = pcs;
		this.bblo = bblo;
	}

	public UnderHornest(int underHornestId, String reo, String blt, String ac, String belts, String cambelt, String cc,
			String cevcoc, String smcoffl, String pshoefac, String atolacc, String bcfl, String wwota, String ffvo,
			String pcs, String bblo) {
		super();
		this.underHornestId = underHornestId;
		this.reo = reo;
		this.blt = blt;
		this.ac = ac;
		this.belts = belts;
		this.cambelt = cambelt;
		this.cc = cc;
		this.cevcoc = cevcoc;
		this.smcoffl = smcoffl;
		this.pshoefac = pshoefac;
		this.atolacc = atolacc;
		this.bcfl = bcfl;
		this.wwota = wwota;
		this.ffvo = ffvo;
		this.pcs = pcs;
		this.bblo = bblo;
	}

	public int getUnderHornestId() {
		return underHornestId;
	}

	public void setUnderHornestId(int underHornestId) {
		this.underHornestId = underHornestId;
	}

	public String getReo() {
		return reo;
	}

	public void setReo(String reo) {
		this.reo = reo;
	}

	public String getBlt() {
		return blt;
	}

	public void setBlt(String blt) {
		this.blt = blt;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getBelts() {
		return belts;
	}

	public void setBelts(String belts) {
		this.belts = belts;
	}

	public String getCambelt() {
		return cambelt;
	}

	public void setCambelt(String cambelt) {
		this.cambelt = cambelt;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCevcoc() {
		return cevcoc;
	}

	public void setCevcoc(String cevcoc) {
		this.cevcoc = cevcoc;
	}

	public String getSmcoffl() {
		return smcoffl;
	}

	public void setSmcoffl(String smcoffl) {
		this.smcoffl = smcoffl;
	}

	public String getPshoefac() {
		return pshoefac;
	}

	public void setPshoefac(String pshoefac) {
		this.pshoefac = pshoefac;
	}

	public String getAtolacc() {
		return atolacc;
	}

	public void setAtolacc(String atolacc) {
		this.atolacc = atolacc;
	}

	public String getBcfl() {
		return bcfl;
	}

	public void setBcfl(String bcfl) {
		this.bcfl = bcfl;
	}

	public String getWwota() {
		return wwota;
	}

	public void setWwota(String wwota) {
		this.wwota = wwota;
	}

	public String getFfvo() {
		return ffvo;
	}

	public void setFfvo(String ffvo) {
		this.ffvo = ffvo;
	}

	public String getPcs() {
		return pcs;
	}

	public void setPcs(String pcs) {
		this.pcs = pcs;
	}

	public String getBblo() {
		return bblo;
	}

	public void setBblo(String bblo) {
		this.bblo = bblo;
	}

	@Override
	public String toString() {
		return underHornestId + "\t" + reo + "\t" + blt + "\t" + ac
				+ "\t" + belts + "\t" + cambelt + "\t" + cc + "\t" + cevcoc + "\t" + smcoffl 
				+ "\t" + pshoefac + "\t" + atolacc + "\t" + bcfl + "\t" + wwota
				+ "\t" + ffvo + "\t" + pcs + "\t" + bblo;
	}
	
	
}
