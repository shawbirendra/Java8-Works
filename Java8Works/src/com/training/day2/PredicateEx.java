package com.training.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
	public static List<Integer> filteredList(List<Integer> numbers, Predicate<Integer> predicate) {
		List<Integer> filteredList = new ArrayList<>();
		for (Integer temp : numbers) {
			if (predicate.test(temp)) {
				filteredList.add(temp);
			}
		}
		return filteredList;
	}

	public static void main(String[] args) {
		Predicate<Integer> greaterThan = i -> i > 10;
		Predicate<Integer> lessThan = i -> i < 10;
		Predicate<Integer> positiveNum = i -> i > 0;
		Predicate<Integer> betweenRange = i -> i > 0 && i < 100;
		////////////////////
		System.out.println(greaterThan.test(5));
		System.out.println("--------------------------------------------------");
		List<Integer> integerList = Arrays.asList(12, 23, 34, 45, -33, -10, 2, 77);

		// passing sinle predicate..
		List<Integer> greaterThan10List = filteredList(integerList, greaterThan);
		greaterThan10List.forEach(System.out::println);
		// we can have compound predicate passed
		Predicate<Integer> compoundPredicate = positiveNum.and(betweenRange);
		List<Integer> compoundList = filteredList(integerList, compoundPredicate);
		System.out.println("-------List of values compound predicate----------");
		compoundList.forEach(System.out::println);

	}
}
