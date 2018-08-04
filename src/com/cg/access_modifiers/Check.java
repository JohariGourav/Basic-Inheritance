package com.cg.access_modifiers;

//Check Class to understand Access Modifiers
public class Check {

	int defaultNum = 1;
	private int privateNum = 2;
	public int publicNum = 3;
	protected int protectedNum = 4;

	// disp method to display all variables
	public void disp() {
		System.out.println(defaultNum + " " + privateNum + " " + publicNum + " " + protectedNum);
	}

}
