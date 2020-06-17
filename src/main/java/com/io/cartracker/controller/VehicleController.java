package com.io.cartracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.io.cartracker.entity.Vehicle;
import com.io.cartracker.service.VehicleService;


@RestController
@Component
@RequestMapping(value = "/vehicles")
public class VehicleController {
	
	VehicleService service;
	
	//find all
	@RequestMapping(method = RequestMethod.POST)
	 public List<Vehicle> repository() {
	        return service.readings();
	    }
	
	 //findone
	@RequestMapping(method = RequestMethod.PUT)
	 public Vehicle create(Vehicle vehicle) {
	        return vehicle;
	    }

	@RequestMapping(method = RequestMethod.PUT)
	 public Vehicle update(String vin, Vehicle vehicle) {
	        return vehicle;
	    }
	 
}
