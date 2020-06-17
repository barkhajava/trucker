package com.io.cartracker.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.io.cartracker.entity.Vehicle;
import com.io.cartracker.repository.VehicleRepository;


public class VehicleServiceImpl implements VehicleService{
	
	
	VehicleRepository repository;
	
	@Transactional
	public List<Vehicle> readings() {
		// TODO Auto-generated method stub
		  return (List<Vehicle>) repository.findAll();
	}

	@Transactional
	public Vehicle create(Vehicle veh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public Vehicle update(String vin, Vehicle veh) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void delete(String vin) {
		// TODO Auto-generated method stub
		
	}

}
