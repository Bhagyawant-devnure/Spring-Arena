package com.FoodDeliveryApplication.implementation;

import com.FoodDeliveryApplication.requirement.FoodService;

//Central application class using FoodService via constructor injection
public class FoodDeliveryApplication {
	private FoodService foodService;
	
	public FoodDeliveryApplication(FoodService foodService) {
		this.foodService=foodService;
	}
	
	public void order(String item)throws Exception{
		this.foodService.orderFood(item);
	}
	public void CncleOrder(String item)throws Exception {
		this.foodService.cancelOrder(item);
		
	}
	public void viewMenu() {
		foodService.viewMenu();
	}
	

}
