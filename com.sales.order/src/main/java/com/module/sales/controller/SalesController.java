package com.module.sales.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sales")

public class SalesController {
	
	@PostMapping("/details")
	public void create() {
		
	}

	
}
