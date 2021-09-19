package com.programacao4devs.factorymethod.product;

import java.util.ArrayList;

public abstract class Cake {
	protected String name;
	protected String dough;
	protected ArrayList toppings = new ArrayList();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding toppings: ");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
	}
	
	public void bake() {
		System.out.println("Bake for 40 minutes at 180");
	}
	
	public void cut() {
		System.out.println("Cutting the cake into square slices");
	}
	
	public void box() {
		System.out.println("Place cake in official CakeStore box");
	}
	
	public String getName() {
		return name;
	}
}
