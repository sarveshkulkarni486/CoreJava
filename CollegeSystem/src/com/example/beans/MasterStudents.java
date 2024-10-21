package com.example.beans;

public class MasterStudents extends Students {
	private String thesis;
	private int thesismarks;
	private String degree;
	public MasterStudents() {
		super();
	}
	public MasterStudents(int pid, String pname, String address, int marks[], String thesis, int thesismarks, String degree) {
		super(pid, pname, address, marks);
		this.thesis = thesis;
		this.thesismarks = thesismarks;
		this.degree = degree;
	}
	public String getThesis() {
		return thesis;
	}
	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	public int getThesismarks() {
		return thesismarks;
	}
	public void setThesismarks(int thesismarks) {
		this.thesismarks = thesismarks;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	@Override
	public String toString() {
		return super.toString()+"MasterStudents [thesis=" + thesis + ", thesismarks=" + thesismarks + ", degree=" + degree + "]";
	}
	
	

}
