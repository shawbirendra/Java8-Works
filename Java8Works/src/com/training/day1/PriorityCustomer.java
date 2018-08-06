package com.training.day1;

public class PriorityCustomer {
	private int customerId;
	private String custName;
	private String type;

	public PriorityCustomer() {
		// TODO Auto-generated constructor stub
	}

	public PriorityCustomer(int customerId, String custName, String type) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "PriorityCustomer [customerId=" + customerId + ", custName=" + custName + ", type=" + type + "]";
	}

}
