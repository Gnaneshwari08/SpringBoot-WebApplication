package com.gnani.model;

public class Bank1 {
	private double namt;
	private double wamt;
	private double tamt;
	private String cpsw;
	private int tano;
	public Bank1() {
		super();
	}
	public Bank1(double namt, double wamt, double tamt, String cpsw, int tano) {
		super();
		this.namt = namt;
		this.wamt = wamt;
		this.tamt = tamt;
		this.cpsw=cpsw;
		this.tano=tano;
	}
	public double getNamt() {
		return namt;
	}
	public void setNamt(double namt) {
		this.namt = namt;
	}
	public double getWamt() {
		return wamt;
	}
	public void setWamt(double wamt) {
		this.wamt = wamt;
	}
	public double getTamt() {
		return tamt;
	}
	public void setTamt(double tamt) {
		this.tamt = tamt;
	}
	public String getCpsw() {
		return cpsw;
	}
	public void setCpsw(String cpsw) {
		this.cpsw=cpsw;
	}
	public int getTano() {
		return tano;
	}
	public void setTano(int tano) {
		this.tano=tano;
	}
	
	
}
