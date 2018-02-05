package com.springbootangular4.services;

import java.util.List;

import com.springbootangular4.entities.Bike;

public interface BikeService {

	List<Bike> getAllBikes();

	Bike getBike(Integer bikeId);

	Bike createBike(Bike bike);

	Bike updateBike(Bike bike);

	void deleteBike(Integer bikeId);

}