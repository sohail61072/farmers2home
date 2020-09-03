package com.mastek.farmer2market.entities;

public class Checkout {
	
	int checkoutID;
	
	String deliveryDate;
	
	double totalCost;

	public int getCheckoutID() {
		return checkoutID;
	}

	public void setCheckoutID(int checkoutID) {
		this.checkoutID = checkoutID;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	

}
