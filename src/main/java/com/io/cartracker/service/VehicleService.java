package com.io.cartracker.service;

import java.util.List;

import com.io.cartracker.entity.Vehicle;


public interface VehicleService {
		
		//POST
		List<Vehicle> readings();

	    //CREATE
	    Vehicle create(Vehicle veh);
	    
	    //PUT
	    Vehicle update(String vin, Vehicle veh);

	    void delete(String vin);
}
