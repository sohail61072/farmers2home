package com.mastek.farmer2market.entities;

public class Order {
	
	int orderID;
	
	String deliveryDate;
	
	double orderTotalCost;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public double getOrderTotalCost() {
		return orderTotalCost;
	}

	public void setOrderTotalCost(double orderTotalCost) {
		this.orderTotalCost = orderTotalCost;
	}
	
	

}
