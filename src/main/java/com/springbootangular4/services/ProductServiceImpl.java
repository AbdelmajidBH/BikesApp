package com.springbootangular4.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springbootangular4.entities.Product;
import com.springbootangular4.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productRepository;

	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> Products = new ArrayList<Product>();
		Iterator<Product> iterator = productRepository.findAll().iterator();
		while (iterator.hasNext()) {
			Products.add(iterator.next());
		}

		return Products;
	}

	@Override
	public Product getProduct(Integer productId) {
		return productRepository.findOne(productId);
	}

	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		/**
		 * 
		 * 
		 * @author A Bahmed
		 * @param id
		 *            of Product
		 */
		if (productRepository.exists(product.getProductId())) {
			System.out.println("c 'est une modification !!");
		}

		return productRepository.save(product);
	}

	@Override
	public void deleteProduct(Integer productId) {
		productRepository.delete(productId);
	}

}