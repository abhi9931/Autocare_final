package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENGINE_TUNE")
public class EngineTune {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "engineTuneId")
	private int engineTuneId;

	@Column(name = "sdb")
	private String sdb;

	@Column(name = "sda")
	private String sda;

	@Column(name = "crank_volt_b")
	private String crank_volt_b;

	@Column(name = "crank_volt_a")
	private String crank_volt_a;

	@Column(name = "charge_volt_b")
	private String charge_volt_b;

	@Column(name = "charge_volt_a")
	private String charge_volt_a;

	@Column(name = "itb")
	private String itb;

	@Column(name = "ita")
	private String ita;

	@Column(name = "ccb")
	private String ccb;

	@Column(name = "cca")
	private String cca;

	@Column(name = "fvlb")
	private String fvlb;

	@Column(name = "fvla")
	private String fvla;

	@Column(name = "rb")
	private String rb;

	@Column(name = "ra")
	private String ra;

	@Column(name = "pcvsb")
	private String pcvsb;

	@Column(name = "pcvsa")
	private String pcvsa;

	@Column(name = "bctb")
	private String bctb;

	@Column(name = "bcta")
	private String bcta;

	@Column(name = "cpbb")
	private String cpbb;

	@Column(name = "clba")
	private String clba;

	@Column(name = "misr")
	private String misr;

	public EngineTune() {
		super();
	}

	public EngineTune(String sdb, String sda, String crank_volt_b, String crank_volt_a, String charge_volt_b,
			String charge_volt_a, String itb, String ita, String ccb, String cca, String fvlb, String fvla, String rb,
			String ra, String pcvsb, String pcvsa, String bctb, String bcta, String cpbb, String clba, String misr) {
		super();
		this.sdb = sdb;
		this.sda = sda;
		this.crank_volt_b = crank_volt_b;
		this.crank_volt_a = crank_volt_a;
		this.charge_volt_b = charge_volt_b;
		this.charge_volt_a = charge_volt_a;
		this.itb = itb;
		this.ita = ita;
		this.ccb = ccb;
		this.cca = cca;
		this.fvlb = fvlb;
		this.fvla = fvla;
		this.rb = rb;
		this.ra = ra;
		this.pcvsb = pcvsb;
		this.pcvsa = pcvsa;
		this.bctb = bctb;
		this.bcta = bcta;
		this.cpbb = cpbb;
		this.clba = clba;
		this.misr = misr;
	}

	public EngineTune(int engineTuneId, String sdb, String sda, String crank_volt_b, String crank_volt_a,
			String charge_volt_b, String charge_volt_a, String itb, String ita, String ccb, String cca, String fvlb,
			String fvla, String rb, String ra, String pcvsb, String pcvsa, String bctb, String bcta, String cpbb,
			String clba, String misr) {
		super();
		this.engineTuneId = engineTuneId;
		this.sdb = sdb;
		this.sda = sda;
		this.crank_volt_b = crank_volt_b;
		this.crank_volt_a = crank_volt_a;
		this.charge_volt_b = charge_volt_b;
		this.charge_volt_a = charge_volt_a;
		this.itb = itb;
		this.ita = ita;
		this.ccb = ccb;
		this.cca = cca;
		this.fvlb = fvlb;
		this.fvla = fvla;
		this.rb = rb;
		this.ra = ra;
		this.pcvsb = pcvsb;
		this.pcvsa = pcvsa;
		this.bctb = bctb;
		this.bcta = bcta;
		this.cpbb = cpbb;
		this.clba = clba;
		this.misr = misr;
	}

	public int getEngineTuneId() {
		return engineTuneId;
	}

	public void setEngineTuneId(int engineTuneId) {
		this.engineTuneId = engineTuneId;
	}

	public String getSdb() {
		return sdb;
	}

	public void setSdb(String sdb) {
		this.sdb = sdb;
	}

	public String getSda() {
		return sda;
	}

	public void setSda(String sda) {
		this.sda = sda;
	}

	public String getCrank_volt_b() {
		return crank_volt_b;
	}

	public void setCrank_volt_b(String crank_volt_b) {
		this.crank_volt_b = crank_volt_b;
	}

	public String getCrank_volt_a() {
		return crank_volt_a;
	}

	public void setCrank_volt_a(String crank_volt_a) {
		this.crank_volt_a = crank_volt_a;
	}

	public String getCharge_volt_b() {
		return charge_volt_b;
	}

	public void setCharge_volt_b(String charge_volt_b) {
		this.charge_volt_b = charge_volt_b;
	}

	public String getCharge_volt_a() {
		return charge_volt_a;
	}

	public void setCharge_volt_a(String charge_volt_a) {
		this.charge_volt_a = charge_volt_a;
	}

	public String getItb() {
		return itb;
	}

	public void setItb(String itb) {
		this.itb = itb;
	}

	public String getIta() {
		return ita;
	}

	public void setIta(String ita) {
		this.ita = ita;
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

	public String getFvlb() {
		return fvlb;
	}

	public void setFvlb(String fvlb) {
		this.fvlb = fvlb;
	}

	public String getFvla() {
		return fvla;
	}

	public void setFvla(String fvla) {
		this.fvla = fvla;
	}

	public String getRb() {
		return rb;
	}

	public void setRb(String rb) {
		this.rb = rb;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getPcvsb() {
		return pcvsb;
	}

	public void setPcvsb(String pcvsb) {
		this.pcvsb = pcvsb;
	}

	public String getPcvsa() {
		return pcvsa;
	}

	public void setPcvsa(String pcvsa) {
		this.pcvsa = pcvsa;
	}

	public String getBctb() {
		return bctb;
	}

	public void setBctb(String bctb) {
		this.bctb = bctb;
	}

	public String getBcta() {
		return bcta;
	}

	public void setBcta(String bcta) {
		this.bcta = bcta;
	}

	public String getCpbb() {
		return cpbb;
	}

	public void setCpbb(String cpbb) {
		this.cpbb = cpbb;
	}

	public String getClba() {
		return clba;
	}

	public void setClba(String clba) {
		this.clba = clba;
	}

	public String getMisr() {
		return misr;
	}

	public void setMisr(String misr) {
		this.misr = misr;
	}

	@Override
	public String toString() {
		return engineTuneId + "\t" + sdb + "\t" + sda + "\t" + crank_volt_b
				+ "\t" + crank_volt_a + "\t" + charge_volt_b
				+ "\t" + charge_volt_a + "\t" + itb + "\t" + ita + "\t" + ccb + "\t" + cca
				+ "\t" + fvlb + "\t" + fvla + "\t" + rb + "\t" + ra + "\t" + pcvsb + "\t" +
				pcvsa + "\t" + bctb + "\t" + bcta + "\t" + cpbb + "\t" + clba + "\t" + misr;
	}
	
	
}
