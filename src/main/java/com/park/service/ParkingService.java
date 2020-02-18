package com.park.service;

import com.park.bo.BookedTime;
import com.park.bo.ParkingSpot;
import com.park.bo.Vehicle;

public interface ParkingService {
	
	public ParkingSpot findSpot(Vehicle vehicle);
	
	public ParkingSpot extendTime(ParkingSpot spot);

	public ParkingSpot bookInAdvance(Vehicle vehicle, BookedTime time);
}
