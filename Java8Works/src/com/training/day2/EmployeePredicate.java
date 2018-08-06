package com.training.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {
	public static List<Employee> filter(List<Employee> le, Predicate<Employee> pred) {
		List<Employee> filter = new ArrayList<>();
		for (Employee temp : le) {
			if (pred.test(temp)) {
				filter.add(temp);
			}
		}
		return filter;
	}

	//////////// Stream API way //////////////////
	public static List<Employee> filteredEmp(List<Employee> le, Predicate<Employee> pred) {
		return le.stream().filter(pred).collect(Collectors.<Employee> toList());
	}

	//////// Predicate in method way //////////
	public static Predicate<Employee> isSalGrteaterThan10k() {
		return e -> e.getSal() > 1000;
	}

	public static void main(String[] args) {
		Employee e = new Employee(101, "Birendra", 10, 15000);
		Employee e1 = new Employee(102, "Rakesh", 5, 25000);
		Employee e2 = new Employee(103, "Shyam", 30, 5000);
		Employee e3 = new Employee(104, "Raju", 15, 30000);
		List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(e);
		listEmployee.add(e1);
		listEmployee.add(e2);
		listEmployee.add(e3);
		/////////   List Of Predicates ////////////////
		Predicate<Employee> deptBetween10n20 = emp -> emp.getDeptNumber() >= 10 && emp.getDeptNumber() <= 20;
		Predicate<Employee> detailsOfEmpSalGrt10000 = emp -> emp.getSal() > 10000;
		Predicate<Employee> namesStartsWith = emp -> emp.getEname().startsWith("B");

		////////////
		System.out.println("----------Dept b/w 10 & 20----------");
		List<Employee> deptBet = filter(listEmployee, deptBetween10n20);
		deptBet.forEach(System.out::println);
		System.out.println("----------Salary > 10000----------");
		List<Employee> salGrt1000 = filter(listEmployee, detailsOfEmpSalGrt10000);
		salGrt1000.forEach(System.out::println);
		System.out.println("----------Name with B----------");
		List<Employee> nameWith = filter(listEmployee, namesStartsWith);
		nameWith.forEach(System.out::println);
	}
}
