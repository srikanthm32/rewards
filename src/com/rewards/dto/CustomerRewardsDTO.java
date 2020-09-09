package com.rewards;

public class CustomerRewardsDTO {
	
	private String customerName;
	private String customerRewardPoints;
	private String customerId;
	private OrderDTO order;
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public String getCustomerRewardPoints() {
		return this.customerRewardPoints;
	}
	
	public String getCustomerId() {
		return this.customerId;
	}
	
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setCustomerId(String customerRewards) {
		this.customerRewardPoints = customerRewards;
	}
}
