package com.module.sales.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.module.sales.entity.OrderDetails;
import com.module.sales.entity.SalesOrder;
import com.module.sales.repository.SalesRepository;
import com.module.sales.view.SalesView;

@Component
public class SalesService {
	@Autowired
	SalesRepository salesRepository;

	public SalesView buildOutput(SalesView salesView) {

		SalesOrder salesOrders = salesView.build(salesView);
		OrderDetails order = salesView.build1(salesView);
		salesOrders.setOrderDetails(order);
		order.setSalesOrders(salesOrders);

		SalesView salesout = new SalesView();
		salesout.buildOutputView(salesRepository.save(salesOrders));
		return salesout;

	}

}
