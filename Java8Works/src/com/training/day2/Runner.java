package com.training.day2;
//all business logics go here
public class Runner {

	public void execute(WorkerInterface workerInterface) {
		System.out.println("Runner.execute()");
		workerInterface.doSomeWork();
	}
}
