package com.springbootangular4.services;

import java.util.List;

import com.springbootangular4.entities.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product getProduct(Integer productId);

	Product createProduct(Product product);

	Product updateProduct(Product product);

	void deleteProduct(Integer productId);

}