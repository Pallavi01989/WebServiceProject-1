package com.webservice.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.main.serviceI.ProductServiceI;

@RestController
public class ProductController {

	@Autowired
	ProductServiceI ps;
	
	
	@GetMapping("/getData")
	public Iterable getAllData()
	{
		
		Iterable list=ps.getAllData();
		
		System.out.println(list);
		return list;
	}
	
	
	
	
}
