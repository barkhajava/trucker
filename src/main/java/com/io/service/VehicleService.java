package com.io.service;

import java.util.List;

import com.io.entity.Vehicle;


public interface VehicleService {


	 List<Vehicle> findAll();

	    Vehicle findOne(Integer vehId);

//	    Employee create(Employee emp);
//
//	    Employee update(String id, Employee emp);
//
//	    void delete(String id);
}
