package com.training.day2.stats;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DragonsClient {
	public static void main(String[] args) {

		List<Dragon> dragons = Stream
				.of(new Dragon("Errol", "USA", 15), new Dragon("Errol", "USA", 33), new Dragon("Firnan", "USA", 5),
						new Dragon("Hasal", "France", 12), new Dragon("IceFire", "France", 3))
				.collect(Collectors.toList());

		// to find number of dragons
		Map<String, Long> mapDragonCount = dragons.stream()
				.collect(Collectors.groupingBy(Dragon::getName, Collectors.counting()));
		//////
		System.out.println(mapDragonCount);
		/////////////// sum of dragon based on name
		System.out.println("=================Report for sum of dragons=======================");
		Map<String, Integer> sumOfDragonds = dragons.stream()
				.collect(Collectors.groupingBy(Dragon::getName, Collectors.summingInt(Dragon::getCount)));
		sumOfDragonds.forEach((k, v) -> {
			System.out.println("Dragon name: " + k + ", No. of dragons " + v);
		});
		// 1.
		// write a java 8 snippet to find the stats of the dragonList, should
		// display sum/average/min/max/avg of dragons
		// 2.
		// find dragons by country and keep the names of dragons of ifferent
		// countries in the list/set
		System.out.println("----------------------------------------------------------------------------------");
		int totalDragons = dragons.stream().collect(Collectors.summingInt(Dragon::getCount));
		// for average
		long avg = dragons.stream().collect(Collectors.summingInt(Dragon::getCount)) / dragons.stream().count();

		// for maximum count
		Integer maxNumber = dragons.stream().max(Comparator.comparing(Dragon::getCount)).get().getCount();
		// for minimum count
		Integer minNumber = dragons.stream().min(Comparator.comparing(Dragon::getCount)).get().getCount();

		
		IntSummaryStatistics stats=dragons.stream().mapToInt(x->x.getCount()).summaryStatistics();
		
		System.out.println("Sum : "+stats.getSum());
		
		System.out.println(maxNumber);
		System.out.println(minNumber);

		System.out.println(totalDragons);
		System.out.println(avg);
	}
}
