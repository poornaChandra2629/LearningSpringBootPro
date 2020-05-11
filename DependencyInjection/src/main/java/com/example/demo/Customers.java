package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customers {
	private int cid;
	private String cname;
	private String couname;
	@Autowired
	private Technologies tech;
	public Technologies getTech() {
		return tech;
	}
	public void setTech(Technologies tech) {
		this.tech = tech;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCouname() {
		return couname;
	}
	public void setCouname(String couname) {
		this.couname = couname;
	}
	public void display()
	{
		System.out.println("Object returns successfully....!!!!");
		tech.tech();
	}

}
