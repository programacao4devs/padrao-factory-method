package com.programacao4devs.factorymethod.cakes;

import com.programacao4devs.factorymethod.product.Cake;

public class ChocolateCake extends Cake {

	public ChocolateCake() {
		name = "Cake of Chocolate";
		dough = "Chocolate Dough";
		
		toppings.add("Chocolate Topping"); 
	}
}
