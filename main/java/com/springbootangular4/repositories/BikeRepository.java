package com.springbootangular4.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springbootangular4.entities.Bike;

public interface BikeRepository extends CrudRepository<Bike, Integer> {

}
