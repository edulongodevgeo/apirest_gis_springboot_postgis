package com.edu.waterwatch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.waterwatch.model.WaterConsumption;
import com.edu.waterwatch.service.WaterConsumptionService;

@RestController
@RequestMapping("/waterconsumption")
public class WaterConsumptionController {
	
	@Autowired
	private WaterConsumptionService waterConsumptionService;
	
	@GetMapping
	public List<WaterConsumption> findAll() {
		return waterConsumptionService.findAll();
	}
	
	@GetMapping(path = "/topten")
	public List<WaterConsumption> findTopTenConsumers() {
		return waterConsumptionService.findTopTenConsumers();
	}

}
