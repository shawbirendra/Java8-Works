package com.training.day2;

public interface IDepartment {

	public void workLocation();

	public default void noOfHrs() {
		System.out.println(" The Project demands to work only till 6PM");
	}

	public static void commonUtility() {
		System.out.println("All Employee have to pass Background Verification");
	}
}
