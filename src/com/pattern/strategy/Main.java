package com.pattern.strategy;

public class Main {

	public static void main(String[] args) {
		Item item1 = new Item(1, 1000);
		Item item2 = new Item(2, 3300);
		
		Cart cart = new Cart();
		cart.addItem(item1);
		cart.addItem(item2);
		
		new CreditCardPayment().pay(cart.getPrice());
		new PaypalPayment().pay(cart.getPrice());
	}

}
