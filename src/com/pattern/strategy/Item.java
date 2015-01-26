package com.pattern.strategy;

public class Item {
	private int upCode;
	private int price;
	
	public Item (int upCode, int price){
		this.upCode = upCode;
		this.price = price;
	}
	
	public int getUpCode(){
		return upCode;
	}
	
	public int getPrice(){
		return price;
	}
}
