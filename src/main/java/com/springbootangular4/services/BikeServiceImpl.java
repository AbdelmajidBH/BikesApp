package com.springbootangular4.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootangular4.entities.Bike;
import com.springbootangular4.repositories.BikeRepository;

@Service
public class BikeServiceImpl implements BikeService {

	@Autowired
	private BikeRepository bikeRepository;

	@Override
	public List<Bike> getAllBikes() {
		List<Bike> bikes = new ArrayList<Bike>();
		Iterator<Bike> iterator = bikeRepository.findAll().iterator();
		while (iterator.hasNext()) {
			bikes.add(iterator.next());
		}

		return bikes;
	}

	@Override
	public Bike getBike(Integer bikeId) {
		return bikeRepository.findOne(bikeId);
	}

	@Override
	public Bike createBike(Bike bike) {
		return bikeRepository.save(bike);
	}

	@Override
	public Bike updateBike(Bike bike) {
		/**
		 * 
		 * 
		 * @author A Bahmed
		 * @param id of bike  
		 */
		if(bikeRepository.exists(bike.getId())) {
		System.out.println("c 'est une modification !!");
		}
		
		return bikeRepository.save(bike);
	}

	@Override
	public void deleteBike(Integer bikeId) {
		bikeRepository.delete(bikeId);
	}

}