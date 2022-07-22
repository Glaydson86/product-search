package com.productsearch.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.productsearch.product.entities.Product;

public interface ProductRepositories extends JpaRepository<Product, Long> {

}
