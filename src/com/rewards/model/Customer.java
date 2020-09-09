package com.rewards.model;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {
	
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String customerId;

	@Column(name = "name")
	private String customerName;
	@Column(name = "address")
	private String customerAddress;
	@Column(name = "phone")
	private String phoneNumber;
	@Column(name = "email")
	private String emailAddress;
	

	@Column(name="rewardPts")
	private Integer customerRewards;
	
	@OnetoMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private List<Order> orders;

	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	public Integer getCustomerRewards() {
		return customerRewards;
	}
	public void setCustomerRewards(Integer customerRewards) {
		this.customerRewards = customerRewards;
	}

}
