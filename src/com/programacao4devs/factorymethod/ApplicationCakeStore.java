package com.programacao4devs.factorymethod;

import com.programacao4devs.factorymethod.cakestore.CakeStore;
import com.programacao4devs.factorymethod.factory.DeliciousCakes;
import com.programacao4devs.factorymethod.product.Cake;

public class ApplicationCakeStore {

	public static void main(String[] args) {
		CakeStore cakeStore = new DeliciousCakes();
		
		Cake cake = cakeStore.orderCake("chocolate");
		System.out.println("Order placed for a " + cake.getName() );

	}

}
