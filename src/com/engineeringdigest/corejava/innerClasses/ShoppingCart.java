package com.engineeringdigest.corejava.innerClasses;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void procesPayment(payment paymentMethod){
        paymentMethod.pay(totalAmount);
    }
}
