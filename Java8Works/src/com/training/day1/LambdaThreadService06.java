package com.training.day1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService06 {
	// this method will create set of callables (each callable is 1 thread)
    //this method will 
	public static Set<Callable<String>> initializeCallables() {
		Set<Callable<String>> callables = new HashSet<>();
		callables.add(() -> "1st Callable");
		callables.add(() -> "2nd Callable");
		callables.add(() -> "3rd Callable");
		callables.add(() -> "4th Callable");
		callables.add(() -> "5th Callable");
		callables.add(() -> "6th Callable");
		callables.add(new Callable<String>() {
			public String call() throws Exception {
				return "Callable thread in anonymous class";
			};
		});
		callables.add(() -> {
			return "complex called business logics";
		});
		return callables;
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// java 7 and older
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hi i'm anonymous Block");
			}
		});
		executorService.shutdown();
		// java8 way
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		executorService2.execute(() -> {
			System.out.println("Hi i'm lambda Block");
		});
		executorService2.shutdown();

	System.out.println("====================callables works===========");
	ExecutorService executorService3=Executors.newSingleThreadExecutor();
	Set<Callable<String>> callables=initializeCallables();
//	String res=executorService3.invokeAny(callables);
//		System.out.println("Result : " + res);
	List<Future<String>> res=executorService3.invokeAll(callables);
	for(Future temp:res){
		System.out.println(temp.get());
	}
		executorService3.shutdown();
	}
}
