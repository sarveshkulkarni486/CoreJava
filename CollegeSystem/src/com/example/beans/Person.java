package com.example.beans;

import java.util.Objects;

public class Person {
	private int pid;
	private String pname;
	private String address;
	
	public Person() {
		super();
	}
	
	public Person(int pid) {
		super();
		this.pid = pid;
	}

	public Person(int pid, String pname, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", address=" + address + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Person ot = (Person) obj;
		System.out.println("Status -->" +this.pid+" "+ot.pid);
		return this.pid==ot.pid;
		
	}
	

}
