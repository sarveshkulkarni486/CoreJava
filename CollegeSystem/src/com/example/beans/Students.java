package com.example.beans;

import java.util.Arrays;

public class Students extends Person {
	private int marsk[] = new int[2];

	public Students() {
		super();
	}

	public Students(int pid, String pname, String address, int[] marsk) {
		super(pid, pname, address);
		this.marsk = marsk;
	}

	public int[] getMarsk() {
		return marsk;
	}

	public void setMarsk(int[] marsk) {
		this.marsk = marsk;
	}

	@Override
	public String toString() {
		return super.toString()+"Students [marsk=" + Arrays.toString(marsk) + "]";
	}

}
