package com.module.sales.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.module.sales.service.SalesService;
import com.module.sales.view.SalesView;

@RestController
@RequestMapping("/sales")
public class SalesController {
	@Autowired
	SalesService salesService;
	@PostMapping("/details")
	public SalesView sales(@RequestBody SalesView salesView) {
		salesService.buildOutput(salesView);
		
		return salesView;
		
		
}
	

}
