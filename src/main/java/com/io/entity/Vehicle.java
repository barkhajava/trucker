package com.io.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue
	@Column(name = "vin")
	private Integer vin;
	
	
	public Vehicle() {
		
	}
	public Integer getVin() {
		return vin;
	}
	public void setVin(Integer vin) {
		this.vin = vin;
	}
	
	
	
}
