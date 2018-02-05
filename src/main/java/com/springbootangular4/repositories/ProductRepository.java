package com.springbootangular4.repositories;

import org.springframework.data.repository.CrudRepository;
import com.springbootangular4.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}
