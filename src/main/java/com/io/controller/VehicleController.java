package com.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.io.entity.Vehicle;
import com.io.repository.VehicleRepository;
import com.io.service.VehicleService;

import io.swagger.annotations.ApiParam;


@RestController
@RequestMapping(value = "/vehicle")
@ComponentScan("com.io.repository")
public class VehicleController {

	@Autowired
	VehicleService service;
	
	//find all
	@GetMapping(value = "/all")
	 public List<Vehicle> repository() {
	    	return service.findAll();
	    }
	@GetMapping(value = "/{id}")
	public Vehicle findOne(
		  @ApiParam(value = "id of the vehicle", required = true) @PathVariable("id") Integer vehId){
		return service.findOne(vehId);
	}
//	@PostMapping(value = "/load")
//	 public Vehicle create() {
//	    	return vehicleRepository.create();
//	    }
	
	
}
