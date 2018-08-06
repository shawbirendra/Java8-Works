package com.training.day2;

import java.util.Arrays;
import java.util.List;

public class PersonImpl {

	public static void main(String[] args) {
		List<Person> personList = Arrays.asList(new Person(101, "Birendra"), new Person(102, "Divya"),
				new Person(103, "Rupa"), new Person(104, "Akshay"));

		personList.forEach(System.out::println);
		//
		System.out.println("===========================================");
		PersonConsumer print = new PersonConsumer();
		personList.forEach(print);
		System.out.println("-------------------------------------------");
		personList.forEach(PrintConsumer::print);
	}
}
