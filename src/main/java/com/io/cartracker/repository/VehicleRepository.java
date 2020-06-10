package com.io.cartracker.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.io.cartracker.entity.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, String> {

	Optional<Vehicle> readings();
	
}
