package com.module.sales.view;

import java.util.Date;

import com.module.sales.entity.OrderDetails;
import com.module.sales.entity.SalesOrder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class SalesView {
	private int sono;
	private String customername;
	private String status;
	private Date date;
	private String productname;
	private int quantity;
	private int price;
	private int totalPrice;

	public SalesOrder build(SalesView salesView) {
		SalesOrder salesOrder = new SalesOrder();

		salesOrder.setCustomername(salesView.getCustomername());
		salesOrder.setSono(salesView.getSono());
		salesOrder.setDate(salesView.getDate());
		salesOrder.setStatus(salesView.getStatus());
		return salesOrder;
	}

	public OrderDetails build1(SalesView salesView) {

		OrderDetails orderDetails = new OrderDetails();
		orderDetails.setPrice(salesView.getPrice());
		orderDetails.setProductname(salesView.getProductname());
		orderDetails.setQuantity(salesView.getQuantity());
		orderDetails.setTotalPrice(salesView.getTotalPrice());

		return orderDetails;
	}

	public SalesView buildOutputView(SalesOrder salesOrder) {
		SalesView salesView = new SalesView();
		salesView.setCustomername(salesOrder.getCustomername());
		salesView.setDate(salesOrder.getDate());
		salesView.setProductname(salesOrder.getOrderDetails().getProductname());
		salesView.setPrice(salesOrder.getOrderDetails().getPrice());
		salesView.setQuantity(salesOrder.getOrderDetails().getQuantity());
		salesView.setSono(salesOrder.getSono());
		salesView.setTotalPrice(salesOrder.getOrderDetails().getTotalPrice());
		return salesView;

	}
}
