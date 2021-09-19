package com.programacao4devs.factorymethod.cakes;

import com.programacao4devs.factorymethod.product.Cake;

public class LemonCake extends Cake {

	public LemonCake() {
		name = "Cake of Lemon";
		dough = "Lemon Dough";
		
		toppings.add("Lemon Topping"); 
	}
}
