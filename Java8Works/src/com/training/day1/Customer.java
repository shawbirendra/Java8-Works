package com.training.day1;

public class Customer {

	private int customerId;
	private String custName;
	private double customerPurchases;
	private String designation;

	public Customer() {
	}

	public Customer(int customerId, String custName, double customerPurchases, String designation) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.customerPurchases = customerPurchases;
		this.designation = designation;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public double getCustomerPurchases() {
		return customerPurchases;
	}

	public void setCustomerPurchases(double customerPurchases) {
		this.customerPurchases = customerPurchases;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custName=" + custName + ", customerPurchases="
				+ customerPurchases + ", designation=" + designation + "]";
	}

}
