package com.autocare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INTERIOR")
public class Interior {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "interiorId")
	private int interiorId;

	@Column(name = "iwl")
	private String iwl;

	@Column(name = "ecl")
	private String ecl;

	@Column(name = "ipl")
	private String ipl;

	@Column(name = "ilcl")
	private String ilcl;

	@Column(name = "wwb")
	private String wwb;

	@Column(name = "wcav")
	private String wcav;

	@Column(name = "mie")
	private String mie;

	@Column(name = "ho")
	private String ho;

	@Column(name = "sb")
	private String sb;

	@Column(name = "ldlcshbl")
	private String ldlcshbl;

	@Column(name = "wo")
	private String wo;

	@Column(name = "btga")
	private String btga;

	@Column(name = "pf")
	private String pf;

	public Interior() {
		super();
	}

	public Interior(String iwl, String ecl, String ipl, String ilcl, String wwb, String wcav, String mie, String ho,
			String sb, String ldlcshbl, String wo, String btga, String pf) {
		super();
		this.iwl = iwl;
		this.ecl = ecl;
		this.ipl = ipl;
		this.ilcl = ilcl;
		this.wwb = wwb;
		this.wcav = wcav;
		this.mie = mie;
		this.ho = ho;
		this.sb = sb;
		this.ldlcshbl = ldlcshbl;
		this.wo = wo;
		this.btga = btga;
		this.pf = pf;
	}

	public Interior(int interiorId, String iwl, String ecl, String ipl, String ilcl, String wwb, String wcav,
			String mie, String ho, String sb, String ldlcshbl, String wo, String btga, String pf) {
		super();
		this.interiorId = interiorId;
		this.iwl = iwl;
		this.ecl = ecl;
		this.ipl = ipl;
		this.ilcl = ilcl;
		this.wwb = wwb;
		this.wcav = wcav;
		this.mie = mie;
		this.ho = ho;
		this.sb = sb;
		this.ldlcshbl = ldlcshbl;
		this.wo = wo;
		this.btga = btga;
		this.pf = pf;
	}

	public int getInteriorId() {
		return interiorId;
	}

	public void setInteriorId(int interiorId) {
		this.interiorId = interiorId;
	}

	public String getIwl() {
		return iwl;
	}

	public void setIwl(String iwl) {
		this.iwl = iwl;
	}

	public String getEcl() {
		return ecl;
	}

	public void setEcl(String ecl) {
		this.ecl = ecl;
	}

	public String getIpl() {
		return ipl;
	}

	public void setIpl(String ipl) {
		this.ipl = ipl;
	}

	public String getIlcl() {
		return ilcl;
	}

	public void setIlcl(String ilcl) {
		this.ilcl = ilcl;
	}

	public String getWwb() {
		return wwb;
	}

	public void setWwb(String wwb) {
		this.wwb = wwb;
	}

	public String getWcav() {
		return wcav;
	}

	public void setWcav(String wcav) {
		this.wcav = wcav;
	}

	public String getMie() {
		return mie;
	}

	public void setMie(String mie) {
		this.mie = mie;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getSb() {
		return sb;
	}

	public void setSb(String sb) {
		this.sb = sb;
	}

	public String getLdlcshbl() {
		return ldlcshbl;
	}

	public void setLdlcshbl(String ldlcshbl) {
		this.ldlcshbl = ldlcshbl;
	}

	public String getWo() {
		return wo;
	}

	public void setWo(String wo) {
		this.wo = wo;
	}

	public String getBtga() {
		return btga;
	}

	public void setBtga(String btga) {
		this.btga = btga;
	}

	public String getPf() {
		return pf;
	}

	public void setPf(String pf) {
		this.pf = pf;
	}

	@Override
	public String toString() {
		return interiorId + "\t" + iwl + "\t" + ecl + "\t" + ipl + "\t" +
				ilcl + "\t" + wwb + "\t" + wcav + ", mie=" + mie + ", ho=" + ho + ", sb=" + sb
				+ ", ldlcshbl=" + ldlcshbl + ", wo=" + wo + ", btga=" + btga + ", pf=" + pf + "]";
	}
	
	
}
