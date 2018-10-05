package com.apap.tutorial4.service;

import com.apap.tutorial4.model.FlightModel;

public interface FlightService {
	void addFlight(FlightModel flight);
	void deleteFlight(FlightModel flight);
	FlightModel getByFlightNumber(String flightNumber);
	void updateFlight(FlightModel flight, String flightNumber);
}
