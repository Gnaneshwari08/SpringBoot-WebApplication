package com.gnani.model;

import javax.persistence.*;

@Entity
public class Bank {
	@Id
	private int ano;
	private String name;
	private String psw;
	private double amt;
	private String add;
	private long mno;
	private int active;
	public Bank() {
		super();
	}
	public Bank(int ano, String name, String psw, double amt, String add, long mno, int active) {
		super();
		this.ano = ano;
		this.name = name;
		this.psw = psw;
		this.amt = amt;
		this.add = add;
		this.mno = mno;
		this.active=active;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public long getMno() {
		return mno;
	}
	public void setMno(long mno) {
		this.mno = mno;
	}
	public int getActive() {
		return ano;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "Bank [ano=" + ano + ", name=" + name + ", psw=" + psw + ", amt=" + amt + ", add="
				+ add + ", mno=" + mno + ", active= " + active +"]";
	}
	
}

