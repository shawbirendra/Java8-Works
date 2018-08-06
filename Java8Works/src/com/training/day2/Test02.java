package com.training.day2;

public class Test02 {
	public static void main(String[] args) {
		WorkerInterface02 wi = largest();
		Runner02 r2 = new Runner02();

		String res = r2.getMaxLength("Hello", "Hello2", wi);
		System.out.println(res);
	}

	public static WorkerInterface02 largest() {
		WorkerInterface02 wi = (a, b) -> {
			if (a.length() > b.length()) {
				return a + " is bigger ";
			} else {
				return b + " is bigger";
			}
		};
		return wi;
	}
}
