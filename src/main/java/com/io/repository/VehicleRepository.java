package com.io.repository;


import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.io.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer>{

	

}
