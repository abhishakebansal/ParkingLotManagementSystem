package com.park.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParkingLotController {
	
	@RequestMapping("/")
	public String test() {
		return "Greetings from Spring Boot";
	}
	

}
