package com.sam;

public interface DefaultDemo {
	
	public void add();
	public void show();
	
	public default void demo() {
		System.out.println("demo");
	}

}
