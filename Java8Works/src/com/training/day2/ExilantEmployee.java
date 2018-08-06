package com.training.day2;

public class ExilantEmployee implements IEmployee, IDepartment {

	@Override
	public void salary() {
		System.out.println("The salary is decided by the project you work");
	}

	@Override
	public void noOfHrs() {
		IDepartment.super.noOfHrs();
	}

	@Override
	public void workLocation() {
		System.out.println("Work location is Bengaluru");
	}

}
