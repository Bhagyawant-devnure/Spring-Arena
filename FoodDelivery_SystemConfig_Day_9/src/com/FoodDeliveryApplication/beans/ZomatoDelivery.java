package com.FoodDeliveryApplication.beans;

import java.util.List;

import com.FoodDeliveryApplication.requirement.FoodService;
import com.customeException.exception.FoodNotFoundException;
import com.customeException.exception.InvalidorderException;

//Implementation of FoodService for Zomato
public class ZomatoDelivery implements FoodService{
	 // Static properties injected via Spring XML
	private static String restaurantName;
	private static String restaurantLocation;
	private static String restaurantCode;

	
	  // Setters used by Spring for dependency injection
	public static void setRestaurantName(String restaurantName) {
		ZomatoDelivery.restaurantName = restaurantName;
	}

	public static void setRestaurantLocation(String restaurantLocation) {
		ZomatoDelivery.restaurantLocation = restaurantLocation;
	}

	public static void setRestaurantCode(String restaurantCode) {
		ZomatoDelivery.restaurantCode = restaurantCode;
	}

	// Business logic for ordering food

	@Override
	public void orderFood(String foodItem) throws FoodNotFoundException, InvalidorderException {
		if(foodItem == null || foodItem.trim().isEmpty()) {
			throw new InvalidorderException("Food is not available");
			
			
		}
		if( availableItems.contains(foodItem)) {
			orderHistory.add(foodItem);
			System.out.println("Order is place"+foodItem);}
		else {
			throw new FoodNotFoundException (foodItem+" is not available in menu");
			
		}
		
		
	}
	 // Logic for cancelling food order
	@Override
	public void cancelOrder(String foodItem) throws InvalidorderException {
		if( orderHistory.contains(foodItem)) {
			orderHistory.remove(foodItem);
			System.out.println("your order will be cancled"+foodItem);
		}else {
			throw new InvalidorderException(foodItem);
			
		}
		
	}

	@Override
	public void viewMenu() {
		System.out.println("Available item"+availableItems);
		
	}
	
	 // Non-static lists for tracking items
	private List <String> availableItems;
	
	private List<String> orderHistory;



	public void setAvailableItems(List<String> availableItems) {
		this.availableItems = availableItems;
	}

	public void setOrderHistory(List<String> orderHistory) {
		this.orderHistory = orderHistory;
	}
	

}
