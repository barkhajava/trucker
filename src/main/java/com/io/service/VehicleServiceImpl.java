package com.io.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.io.entity.Vehicle;
import com.io.exception.ResourceNotFoundException;
import com.io.repository.VehicleRepository;



@Service
public class VehicleServiceImpl implements VehicleService{

@Autowired
VehicleRepository repository;

	public List<Vehicle> findAll() {
		// TODO Auto-generated method stub
		   return (List<Vehicle>) repository.findAll();
	}
	 @Transactional(readOnly = true)
	    public Vehicle findOne(Integer id) {
	        return repository.findById(id)
	                         .orElseThrow(
	                                 () -> new ResourceNotFoundException("Vehicle with id " + id + " doesn't exist."));
	    }
	
	
}
