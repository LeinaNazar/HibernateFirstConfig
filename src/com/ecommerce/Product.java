package com.ecommerce;

import java.util.Date;

public class Product {// pojo class , bean

	private int pid;
	private String pname;
	private double price;
	private Date Dop;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + ", Dop=" + Dop + "]";
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getDop() {
		return Dop;
	}
	public void setDop(Date dop) {
		Dop = dop;
	}
	public Product(String pname, double price, Date dop) {
		super();
		this.pname = pname;
		this.price = price;
		Dop = dop;
	}
}
