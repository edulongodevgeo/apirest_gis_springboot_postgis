package com.edu.waterwatch.model;

import lombok.Getter;
import lombok.Setter;

import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "WaterConsumption")
public class WaterConsumption implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "suburb")
	private String suburb;
	
	@Column(name = "avgMonthlyKL")
	private Integer avgMonthlyKL;
	
	@Column(name = "geom")
	private Point geom;

	
	//Getters and Setters para análise (não precisava, pois utilizo o Lombok)
	public String getSuburb() {
		return suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	public Integer getAvgMonthlyKL() {
		return avgMonthlyKL;
	}

	public void setAvgMonthlyKL(Integer avgMonthlyKL) {
		this.avgMonthlyKL = avgMonthlyKL;
	}

	public Point getGeom() {
		return geom;
	}

	public void setGeom(Point geom) {
		this.geom = geom;
	}
	
	

}
