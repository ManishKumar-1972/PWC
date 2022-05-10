package com.miniapp;

public class FrontdeskService {
	
	private Restaurant restaurant;
	
	public FrontdeskService(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public String takeOrder (String dish) {
		return restaurant.prepareFood(dish);
	}

}
