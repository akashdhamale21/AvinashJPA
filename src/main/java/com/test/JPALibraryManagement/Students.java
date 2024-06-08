package com.test.JPALibraryManagement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	private int sid;
	private String sname;
	private String saddress;
	private String collage;
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Students(int sid, String sname, String saddress, String collage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.saddress = saddress;
		this.collage = collage;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public String getCollage() {
		return collage;
	}
	public void setCollage(String collage) {
		this.collage = collage;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", saddress=" + saddress + ", collage=" + collage + "]";
	}
}
