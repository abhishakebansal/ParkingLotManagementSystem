package com.park.bo;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
public class ParkingSpot {
	
	private String parkingSpot;
	
	private String level;
	
	private boolean isCovered;
	
	private boolean is24Hr;
	
	private ParkingLot lot;
	
	private boolean onlyForHeavy;

}
