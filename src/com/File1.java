package com;

public class File1 {

	String productName;
	int productId,productPrice;
	File1(String productName,int productId,int productPrice){
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	@Override
	public String toString() {
		return "File1 [productName=" + productName + ", productId=" + productId + ", productPrice=" + productPrice
				+ "]";
	}
	
}
