package com.rewards.model;

import java.sql.Date;
import java.util.List;

public class Order {
	
	@Id
	@Column(name = "Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	
	@Column(name = "orderTotal")
	private Double orderTotal;
	
	@Column(name = "orderTotal")
	private Date orderDate;
	
	@ManytoOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "order_id", insertable = false, updatable = false)
	@Fetch(FetchMode.JOIN)
	private Customer customerDetails;

	
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Double getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(Double orderTotal) {
		this.orderTotal = orderTotal;
	}
	public List<Product> getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(List<Product> productDetails) {
		this.productDetails = productDetails;
	}
	public Customer getCustomerDetails() {
		return customerDetails;
	}
	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}
}
