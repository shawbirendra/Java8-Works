package com.training.day2;

public interface IEmployee {
	public void salary();

	public default void noOfHrs() {
		System.out.println("Every Employee has to work for 8 hrs...");
	}
}
