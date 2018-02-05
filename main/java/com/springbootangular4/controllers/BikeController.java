package com.springbootangular4.controllers;

import java.util.List;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootangular4.entities.Bike;
import com.springbootangular4.services.BikeService;

@RestController
@RequestMapping("/api/bikes")
public class BikeController {

	private BikeService bikeService;

	public BikeController(BikeService bikeService) {
		this.bikeService = bikeService;
	}

	@RequestMapping(value = "/allBikes", method = RequestMethod.GET)
	public List<Bike> getAllBikes() {

		return bikeService.getAllBikes();
	}

	@RequestMapping(value = "/getBike/{bikeId}", method = RequestMethod.GET)
	public Bike getBike(@PathVariable("bikeId") Integer bikeId) {
		return bikeService.getBike(bikeId);
	}

	@RequestMapping(value = "/createBike", method = RequestMethod.POST)
	public Bike createBike(@RequestBody Bike bike) {
		return bikeService.createBike(bike);
	}

	@RequestMapping(value = "/updateBike", method = RequestMethod.POST)
	public Bike updateBike(@RequestBody Bike bike) {
		return bikeService.updateBike(bike);
	}

	@RequestMapping(value = "/deleteBike/{bikeId}", method = RequestMethod.GET)
	public void deleteBike(@PathVariable("bikeId") Integer bikeId) {
		bikeService.deleteBike(bikeId);
	}

}