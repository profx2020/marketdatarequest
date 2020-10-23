package com.profx.fixservices.marketDataRequest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MarketDataRequestController {

	
	@GetMapping("/MarketDataRequest")
	public String doMarketDataRequest()throws Exception{
		System.out.print("MarketDataRequest");
		return "MarketDataRequest";
	}

}
