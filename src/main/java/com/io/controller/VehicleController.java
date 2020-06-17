package com.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.io.entity.Vehicle;
import com.io.repository.VehicleRepository;



@RestController
@RequestMapping(value = "/vehicle")
@ComponentScan("com.io.repository")
public class VehicleController {

	@Autowired
	VehicleRepository vehicleRepository;
	
	//find all
	@GetMapping(value = "/all")
	 public List<Vehicle> repository() {
	    	return vehicleRepository.findAll();
	    }
	
//	@PostMapping(value = "/load")
//	 public Vehicle create() {
//	    	return vehicleRepository.create();
//	    }
	
	
}
