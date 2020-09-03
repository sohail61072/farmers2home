package com.mastek.farmer2market.entities;

public class Product {
	
	int productID;
	
	int productName;
	
	productType productType;
	
	String productDescription;
	
	float productPrice;
	
	int productQuantity;
	
	float productWeightKG;

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getProductName() {
		return productName;
	}

	public void setProductName(int productName) {
		this.productName = productName;
	}

	public productType getProductType() {
		return productType;
	}

	public void setProductType(productType productType) {
		this.productType = productType;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public float getProductWeightKG() {
		return productWeightKG;
	}

	public void setProductWeightKG(float productWeightKG) {
		this.productWeightKG = productWeightKG;
	}
	
	

}
