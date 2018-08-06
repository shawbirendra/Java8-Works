package com.training.day2;

public class WorkerInterfaceTest {
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.execute(new WorkerInterface() {

			@Override
			public void doSomeWork() {
				System.out.println("Hi we are doing some work in main");
			}
		});
		//////
		System.out.println("-----------------------------------------------------");
		runner.execute(() -> System.out.println("Hi i'm in lambda way in main"));
		;

		////
		System.out.println("-----------------------------------------------------");
		runner.execute(() -> {
			System.out.println("In lambda way, in multiple lines");
			System.out.println("can have any business logic here...");
		});
	}
}
