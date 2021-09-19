package com.programacao4devs.factorymethod.cakestore;

import com.programacao4devs.factorymethod.product.Cake;

public abstract class CakeStore {
	
	protected abstract Cake createCake(String type);
	
	public Cake orderCake(String type) {
		Cake cake;
		
		cake = createCake(type);
		
		cake.prepare();
		cake.bake();
		cake.cut();
		cake.box();
		
		return cake;
	}
}
