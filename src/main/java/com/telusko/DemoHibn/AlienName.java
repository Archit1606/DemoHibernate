package com.telusko.DemoHibn;

import jakarta.persistence.Embeddable;

@Embeddable
public class AlienName {
	private String fname;
	private String mname;
	private String ename;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
