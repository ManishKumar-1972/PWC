package com.sam;

public class WorkerApp {
	public static void execute(WorkerInterface wi) {
		wi.doSomeWork();
	}
	
	public static void main(String[] args) {
		execute(new WorkerInterface() {
			
			@Override
			public void doSomeWork() {
				System.out.println("doing something");
				
			}
		});
		
		execute(()->System.out.println("doing again"));
	}

}
