package com.edu.waterwatch.repository;

import com.edu.waterwatch.model.WaterConsumption;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface WaterConsumptionRepository extends JpaRepository<WaterConsumption, Integer> {

	@Query(nativeQuery = true, value = " SELECT * FROM waterconsumption" + " ORDER BY avgMonthlyKL DESC" + " LIMIT 10")
	List<WaterConsumption> findTopTenConsumers();
}
