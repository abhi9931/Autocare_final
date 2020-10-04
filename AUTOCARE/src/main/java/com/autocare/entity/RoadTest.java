package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROAD_TEST")
public class RoadTest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "roadTestId")
	private int roadTestId;

	@Column(name = "fscafm")
	private String fscafm;

	@Column(name = "cowtcb")
	private String cowtcb;

	@Column(name = "ovd")
	private String ovd;

	@Column(name = "rt")
	private String rt;

	@Column(name = "acchc")
	private String acchc;

	@Column(name = "actc")
	private String actc;

	@Column(name = "howl")
	private String howl;

	@Column(name = "fo")
	private String fo;

	@Column(name = "cgo")
	private String cgo;

	@Column(name = "ato")
	private String ato;

	@Column(name = "sis")
	private String sis;

	@Column(name = "rcc")
	private String rcc;

	public RoadTest() {
		super();
	}

	public RoadTest(String fscafm, String cowtcb, String ovd, String rt, String acchc, String actc, String howl,
			String fo, String cgo, String ato, String sis, String rcc) {
		super();
		this.fscafm = fscafm;
		this.cowtcb = cowtcb;
		this.ovd = ovd;
		this.rt = rt;
		this.acchc = acchc;
		this.actc = actc;
		this.howl = howl;
		this.fo = fo;
		this.cgo = cgo;
		this.ato = ato;
		this.sis = sis;
		this.rcc = rcc;
	}

	public RoadTest(int roadTestId, String fscafm, String cowtcb, String ovd, String rt, String acchc, String actc,
			String howl, String fo, String cgo, String ato, String sis, String rcc) {
		super();
		this.roadTestId = roadTestId;
		this.fscafm = fscafm;
		this.cowtcb = cowtcb;
		this.ovd = ovd;
		this.rt = rt;
		this.acchc = acchc;
		this.actc = actc;
		this.howl = howl;
		this.fo = fo;
		this.cgo = cgo;
		this.ato = ato;
		this.sis = sis;
		this.rcc = rcc;
	}

	public int getRoadTestId() {
		return roadTestId;
	}

	public void setRoadTestId(int roadTestId) {
		this.roadTestId = roadTestId;
	}

	public String getFscafm() {
		return fscafm;
	}

	public void setFscafm(String fscafm) {
		this.fscafm = fscafm;
	}

	public String getCowtcb() {
		return cowtcb;
	}

	public void setCowtcb(String cowtcb) {
		this.cowtcb = cowtcb;
	}

	public String getOvd() {
		return ovd;
	}

	public void setOvd(String ovd) {
		this.ovd = ovd;
	}

	public String getRt() {
		return rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}

	public String getAcchc() {
		return acchc;
	}

	public void setAcchc(String acchc) {
		this.acchc = acchc;
	}

	public String getActc() {
		return actc;
	}

	public void setActc(String actc) {
		this.actc = actc;
	}

	public String getHowl() {
		return howl;
	}

	public void setHowl(String howl) {
		this.howl = howl;
	}

	public String getFo() {
		return fo;
	}

	public void setFo(String fo) {
		this.fo = fo;
	}

	public String getCgo() {
		return cgo;
	}

	public void setCgo(String cgo) {
		this.cgo = cgo;
	}

	public String getAto() {
		return ato;
	}

	public void setAto(String ato) {
		this.ato = ato;
	}

	public String getSis() {
		return sis;
	}

	public void setSis(String sis) {
		this.sis = sis;
	}

	public String getRcc() {
		return rcc;
	}

	public void setRcc(String rcc) {
		this.rcc = rcc;
	}

	@Override
	public String toString() {
		return "RoadTest [roadTestId=" + roadTestId + ", fscafm=" + fscafm + ", cowtcb=" + cowtcb + ", ovd=" + ovd
				+ ", rt=" + rt + ", acchc=" + acchc + ", actc=" + actc + ", howl=" + howl + ", fo=" + fo + ", cgo="
				+ cgo + ", ato=" + ato + ", sis=" + sis + ", rcc=" + rcc + "]";
	}
	
}
