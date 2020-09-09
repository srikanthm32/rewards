package com.rewards;

public class CustomerRewardsDTO {
	
	private String orderId;
	private String orderTotal;
	private String orderDate;
	
	public String getOrderId() {
		return this.orderId;
	}
	
	public String getOrderTotal() {
		return this.orderTotal
	}
	
	public String getOrderDate() {
		return this.orderDate;
	}
	
	public void setOrderId(String customerId) {
		this.orderId = orderId;
	}
	
	public void setOrderTotal(String orderTotal) {
		this.orderTotal = orderTotal;
	}
	
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
}
