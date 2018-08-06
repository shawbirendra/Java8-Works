package com.training.day2;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class RandomFilterEx {
	public static void main(String[] args) {
		// thi swill generate one random number
		int randomNumber = ThreadLocalRandom.current().nextInt(100, 200);
		System.out.println(randomNumber);

		///////////////////////////
		System.out.println("-------------------------------------");
		Random random = new Random();
		// 10 number b/w 100-200
		random.ints(10, 100, 200).forEach(System.out::println);
		// we want in sorted number
		System.out.println("-------------------in sorted------------------");
		random.ints(10, 1000, 1200).sorted().forEach(System.out::println);
		System.out.println("-------------------sum------------------");
		int res = random.ints(10, 1000, 1200).sum();
		System.out.println(res);

		///////////////////////////////////
		System.out.println("-------------------Stream------------------");
		//Stream.generate(Math::random).limit(5).forEach(System.out::println);
		Stream.iterate(10,i->i+1).limit(20).sorted().forEach(System.out::println);

	}
}
