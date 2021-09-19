package com.programacao4devs.factorymethod.cakes;

import com.programacao4devs.factorymethod.product.Cake;

public class CoconutCake extends Cake {

	public CoconutCake() {
		name = "Cake of Coconut";
		dough = "Coconut Dough";
		
		toppings.add("Coconut Topping"); 
	}
}