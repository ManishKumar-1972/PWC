package com.miniapp;

public class JapaneseRestaurant implements Restaurant {

	@Override
	public String prepareFood(String dishName) {
		return "preparing " + dishName + " with japanese spices";
	}
	
	
	

}
