package com.module2.sales.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module2.sales.consumer.model.SalesOrder;
import com.module2.sales.repository.MongodbRepo;


@RestController
@RequestMapping("/order")
public class SalesorderServices {

	@Autowired
	private MongodbRepo repo;
	
	@PostMapping("/new")
	public String create(@RequestBody SalesOrder salesorder) {
	repo.save(salesorder);
	
		return "Success";
		
	}
}
