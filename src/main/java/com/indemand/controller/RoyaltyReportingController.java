package com.indemand.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/royalty")
public class RoyaltyReportingController {

	private static final Logger LOGGER = LogManager.getLogger(RoyaltyReportingController.class);

	@GetMapping(path="/hearbeat")
	@ApiOperation(value = "Checks whether the Royalty Reporting Service is up and running")
	public String sayHello(){
		LOGGER.info("Heartbeat");
		return "RoyaltyReporting Service up & running";
	}
	
	
}
