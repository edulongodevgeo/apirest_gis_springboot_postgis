package com.edu.waterwatch.service;

import com.edu.waterwatch.model.WaterConsumption;
import java.util.List;

public interface WaterConsumptionService {

	List<WaterConsumption> findAll();
	List<WaterConsumption> findTopTenConsumers();
}
