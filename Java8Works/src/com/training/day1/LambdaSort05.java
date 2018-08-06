package com.training.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaSort05 {
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "Ramu", 6000, "Engineer"),
				new Customer(102, "Allahrakha", 6500, "Developer"), new Customer(103, "Pooja", 4500, "Lead"),
				new Customer(104, "Divya", 5600, "Engineer"), new Customer(105, "Rupa", 4000, "Developer"));
		System.out.println("------------Before Sort-----------------");
		customers.forEach(System.out::println);
		
		//System.out.println("------------jdk 1.7 or older-----------------");
		Collections.sort(customers,new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {				
				return o1.getCustName().compareTo(o2.getCustName());
			}
		});
		System.out.println("-------------after sort-------------");
		customers.forEach(System.out::println);
		//with java 8
		System.out.println("------------sort with lambda on purchase--------");
		customers.sort((Customer c1,Customer c2)->(int)(c1.getCustomerPurchases()-c2.getCustomerPurchases()));
		customers.forEach(System.out::println);
		//java 8 way
		System.out.println("------------sort with lambda on designation--------");
		customers.sort((Customer c1,Customer c2)->c1.getDesignation().compareTo(c2.getDesignation()));
		customers.forEach(System.out::println);
		///////////////////
		Comparator<Customer> comparator=(c1,c2)->c1.getCustName().compareTo(c2.getCustName());
		Collections.sort(customers,comparator);
		
		customers.forEach(System.out::println);

		customers.sort(comparator.reversed());
		System.out.println("===============reverse============");
		customers.forEach(System.out::println);
	}
}
