package com.training.day1;

public class LambdaThread04 {
	public static void main(String[] args) {
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hi i'm from Ananymous call.. Start");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("ananymous call exiting");
			}
		}).start();
		////////////// Lambda based///////////////
		new Thread(() -> {
			System.out.println("Hi i'm from Lambda");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("lambda call exiting");
		}).start();
		
		/////////////////
		new Thread(()->{
			
		});
	}
}
