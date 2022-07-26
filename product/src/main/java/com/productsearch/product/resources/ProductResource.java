package com.productsearch.product.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productsearch.product.entities.Product;
import com.productsearch.product.repositories.ProductRepositories;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

	@Autowired
	private ProductRepositories repository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = repository.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value= "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}