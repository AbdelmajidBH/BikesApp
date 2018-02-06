package com.springbootangular4.controllers;


import java.text.ParseException;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootangular4.entities.Product;
import com.springbootangular4.services.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping(value = "/allProducts")
	public List<Product> getAllBikes() {

		return productService.getAllProducts();
	}

	@GetMapping(value = "/getProduct/{productId}")
	public Product getProduct(@PathVariable("productId") Integer productId) {
		return productService.getProduct(productId);
	}

	@PostMapping(value = "/createProduct")
	public Product createProduct(@RequestBody Product product) throws ParseException {
		//DateFormat parser = new SimpleDateFormat("dd MMM yyyy");
		//Date date = parser.parse(product.getReleaseDate().toString());
		return productService.createProduct(product);
	}

	@RequestMapping(value = "/updateBike", method = RequestMethod.POST)
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@RequestMapping(value = "/deleteBike/{bikeId}", method = RequestMethod.GET)
	public void deleteProduct(@PathVariable("bikeId") Integer productId) {
		productService.deleteProduct(productId);
	}

}