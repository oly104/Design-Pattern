package com.pattern.strategy;

public class PaypalPayment implements PaymentStrategy{

	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid by paypal");		
	}

}
