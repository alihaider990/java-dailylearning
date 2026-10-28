package com.engineeringdigest.corejava.innerClasses;

public class CreditCardV0 implements payment{


    private     String  creditCardNumber;

    public CreditCardV0(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double amount){
        System.out.println("paid " + amount + " using credit card.");
    }
}
