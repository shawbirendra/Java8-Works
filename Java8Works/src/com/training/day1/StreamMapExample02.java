package com.training.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//to show working of map and filter based on the customer type.

public class StreamMapExample02 {
	// syntax up to jdk 1.7
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomers = new ArrayList<PriorityCustomer>();
		for (Customer temp : customers) {
			if (temp.getCustomerPurchases() < 5000) {
				priorityCustomers.add(new PriorityCustomer(temp.getCustomerId(), temp.getCustName(), "GOLD"));
			}
		}
		return priorityCustomers;
	}
	/**
	 * Returns a sequential Stream with this collection as its source.
	 * 
	 * This method should be overridden when the spliterator() method cannot
	 * return a spliterator that is IMMUTABLE, CONCURRENT, or late-binding.
	 * (See spliterator() for details.)
	 * 
	 * Returns: a sequential Stream over the elements in this collection
	 */
	// map() ====> Returns a stream consisting of the results of applying
	// the given function to the elements of this stream.

	// in java 8
	// to filter the customer as silver,gold,platinum with map
	// if no condition is maped the null is returned(optional)
	public static List<PriorityCustomer> filterCustomers1(List<Customer> customers) {
		List<PriorityCustomer> priorityCustomers = customers.stream().map(temp -> {
			// if (temp.getCustomerPurchases() > 5000) {
			// return new PriorityCustomer(temp.getCustomerId(),
			// temp.getCustName(), "Gold");
			// }
			return new PriorityCustomer(temp.getCustomerId(), temp.getCustName(),
					temp.getCustomerPurchases() > 0 && temp.getCustomerPurchases() < 3000 ? "silver"
							: temp.getCustomerPurchases() > 3000 && temp.getCustomerPurchases() < 5000 ? "Gold"
									: "Platinum");
		}).collect(Collectors.toList());
		return priorityCustomers;
	}

	public static List<PriorityCustomer> filterCustomers2(List<Customer> customers) {
		return customers.stream().filter(temp -> temp.getCustomerPurchases() > 5000).map(temp -> {
			return new PriorityCustomer(temp.getCustomerId(), temp.getCustName(), "Gold");
		}).collect(Collectors.toList());

	}
	public static List<PriorityCustomer> filterCustomers4(List<Customer> customers) {
		return customers.stream().filter(temp -> temp.getCustomerPurchases() > 5000).map(temp -> {
			return new PriorityCustomer(temp.getCustomerId(), temp.getCustName(), "Gold");
		}).collect(Collectors.toList());

	}

	public static List<PriorityCustomer> filterCustomers3(List<Customer> customers) {
		return customers.stream().filter(temp -> temp.getCustomerPurchases() <= 3000).map(temp -> {
			return new PriorityCustomer(temp.getCustomerId(), temp.getCustName(), "Silver");
		}).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(new Customer(101, "Ramu", 6000, "Engineer"),
				new Customer(102, "Allahrakha", 6500, "Developer"), new Customer(103, "Pooja", 4500, "Lead"),
				new Customer(104, "Divya", 5600, "Engineer"), new Customer(105, "Rupa", 4000, "Developer"));

		filterCustomers1(customers).forEach(System.out::println);

	}

}
