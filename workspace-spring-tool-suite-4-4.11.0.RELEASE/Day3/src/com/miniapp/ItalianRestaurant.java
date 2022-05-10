package com.miniapp;

public class ItalianRestaurant implements Restaurant {

	@Override
	public String prepareFood(String dishName) {
		return "preparing " + dishName + " with italian herbs";
	}
	

}
