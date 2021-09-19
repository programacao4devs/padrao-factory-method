package com.programacao4devs.factorymethod.factory;

import com.programacao4devs.factorymethod.cakes.CarrotCake;
import com.programacao4devs.factorymethod.cakes.ChocolateCake;
import com.programacao4devs.factorymethod.cakes.CoconutCake;
import com.programacao4devs.factorymethod.cakes.LemonCake;
import com.programacao4devs.factorymethod.cakestore.CakeStore;
import com.programacao4devs.factorymethod.product.Cake;

public class DeliciousCakes extends CakeStore {

	@Override
	protected Cake createCake(String type) {
		if (type.equals("chocolate")) {
			return new ChocolateCake();
		} else if (type.equals("carrot")) {
			return new CarrotCake();
		} else if (type.equals("lemon")) {
			return new LemonCake();
		} else if (type.equals("coconut")) {
			return new CoconutCake();
		} else {
			return null;
		}
	}

}
