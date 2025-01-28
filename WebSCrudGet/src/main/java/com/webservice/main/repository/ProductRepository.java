package com.webservice.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webservice.main.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {

	
}

