package com.mastek.farmer2market.entities;

public class Item {

	int itemID;
	
	String itenName;
	
	double itemPrice;
	
	double itemQuantity;

	public int getItemID() {
		return itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public String getItenName() {
		return itenName;
	}

	public void setItenName(String itenName) {
		this.itenName = itenName;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(double itemQuantity) {
		this.itemQuantity = itemQuantity;
	}
	
	
}
