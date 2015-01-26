package com.pattern.strategy;

import java.util.ArrayList;

public class Cart {
	private ArrayList<Item> items;
	
	public Cart(){
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public void removItem(Item item){
		items.remove(item);
	}
	
	public int getPrice(){
		int sum = 0;
		for(Item item : items){
			sum += item.getPrice();
		}
		return sum;
	}
}
