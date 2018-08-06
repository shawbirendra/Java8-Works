package com.training.day2;

public class Employee {

	private int eid;
	private String ename;
	private int deptNumber;
	private double sal;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Employee(int eid, String ename, int deptNumber, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.deptNumber = deptNumber;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", deptNumber=" + deptNumber + ", sal=" + sal + "]";
	}
	
}
