package com.apap.tutorial4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.tutorial4.model.FlightModel;
/**
 * 
 * FlightDB
 *
 */
public interface FlightDB extends JpaRepository<FlightModel, Long>{
	FlightModel findByFlightNumber(String flightNumber );
}
