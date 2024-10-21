package com.example.beans;

public class GraduateStudents extends Students {
	private int spmarks;

	public GraduateStudents() {
		super();
	}

	public GraduateStudents(int pid, String pname, String address, int marks[], int spmarks) {
		super(pid, pname, address, marks);
		this.spmarks = spmarks;
	}

	public int getSpmarks() {
		return spmarks;
	}

	public void setSpmarks(int spmarks) {
		this.spmarks = spmarks;
	}

	@Override
	public String toString() {
		return super.toString()+"GraduateStudents [spmarks=" + spmarks + "]";
	}
	

}
