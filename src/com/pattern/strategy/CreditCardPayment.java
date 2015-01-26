package com.pattern.strategy;

public class CreditCardPayment implements PaymentStrategy {

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid by credit card");
	}

}
