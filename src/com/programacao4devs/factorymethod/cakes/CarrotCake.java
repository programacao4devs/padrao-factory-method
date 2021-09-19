package com.programacao4devs.factorymethod.cakes;

import com.programacao4devs.factorymethod.product.Cake;

public class CarrotCake extends Cake {

	public CarrotCake() {
		name = "Cake of Carrot";
		dough = "Carrot Dough";
		
		toppings.add("Carrot Topping"); 
	}
}