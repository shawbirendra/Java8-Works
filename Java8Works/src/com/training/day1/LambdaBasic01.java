package com.training.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBasic01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);

		System.out.println("----------before jdk 1.5------------");
		// till < jdk1.5
		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("----------post jdk 1.5------------");
		// till jdk1.7
		for (Integer num : numbers) {
			System.out.println(num);
		}
		System.out.println("----------after jdk 1.7 with lambda------------");
		// from jdk1.8 with lambda
		numbers.forEach((Integer temp) -> System.out.println(temp));

		// behind the screen
		System.out.println("----------with consumer--------------");
		numbers.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			};
		});
		// in lambda way 1.8
		System.out.println("---------- lambda way(01)------------");
		numbers.forEach((Integer temp) -> System.out.println(temp));
		// this is called as method references
		System.out.println("---------- lambda way(02)------------");
		numbers.forEach(System.out::println);
		int sum = 0;
		System.out.println("=================sum before jdk 1.7===================");
		for (Integer in : numbers) {
			sum += in*2;
		}
		System.out.println(sum);
		System.out.println("=================jdk 1.8===================");
		
		System.out.println(numbers.stream().map(e->e*2).reduce((res,e)->res+e));
		System.out.println(numbers.stream().map(e->e*2));
	}
}
