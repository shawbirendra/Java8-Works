package com.training.day2;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person> {

	@Override
	public void accept(Person t) {
		System.out.println("Person ID: " + t.getPid() + ", PersonName: " + t.getName());
	}

}

class PrintConsumer {
	static void print(Person p) {
		System.out.println("Static-->Person ID: " + p.getPid() + ", PersonName: " + p.getName());
	}
}
