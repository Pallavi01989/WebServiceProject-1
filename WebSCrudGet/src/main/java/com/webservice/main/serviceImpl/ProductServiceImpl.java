package com.webservice.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webservice.main.model.Product;
import com.webservice.main.repository.ProductRepository;
import com.webservice.main.serviceI.ProductServiceI;

@Service
public class ProductServiceImpl implements ProductServiceI{

	
	@Autowired
	ProductRepository pr;
	
	
	@Override
	public Iterable<Product> getAllData() {
		
		return pr.findAll();
		
	}

	
	
}
