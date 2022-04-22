package com.module.sales.presistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_details")

public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private long id;
	
	@OneToOne
   	@JoinColumn(name="sales_order_id")
	
	private SalesOrders salesOrders;
	
	public SalesOrders getSalesOrders() {
		return salesOrders;
	}

	public void setSalesOrders(SalesOrders salesOrders) {
		this.salesOrders = salesOrders;
	}

	@Column(name = "product_name")
	private String productname;

	@Column(name = "quantity")
	private int quantity;

	@Column(name = "price")
	private int price;

	@Column(name = "total_price")
	private int totalPrice;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
	

}
