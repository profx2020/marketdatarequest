package com.profx.fixservices.profx.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MarketDataRequestController {

	
	@GetMapping("/MarketDataRequest")
	public String getHeartBeat(){
		System.out.print("MarketDataRequest");
		return "MarketDataRequest";
	}

}
