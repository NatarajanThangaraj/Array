package com.natarajanthangaraj.problemsolving.kfcordertracker;

public class Order {
private String OrderNumber;
	 Order(String next) {
		this.OrderNumber=next;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}

	

}
