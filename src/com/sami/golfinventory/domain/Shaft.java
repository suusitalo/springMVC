package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Shaft {
	
	@NotNull
	@Size(min=2, max=45)
	private String shaftManufacturer;
	@NotNull
	@Size(min=2, max=45)
	private String shaftModel;
	@NotNull(message = "Select shaft weight between 30 and 200 grams.")
	@Min(value = 30, message = "Select shaft weight between 30 and 200 grams.")
	@Max(value = 200, message = "Select shaft weight between 30 and 200 grams.")
	private Integer shaftRawWeight;
	@NotNull
	@Size(min=1, max=5) @IsValidShaftFlex
	private String shaftFlex;
	@NotNull(message = "Select grip manufacturer.")
	@Size(min=2, max=45,message = "Select grip manufacturer.")
	private String grip;
	
	public String getShaftManufacturer() {
		return shaftManufacturer;
	}
	public void setShaftManufacturer(String shaftManufacturer) {
		this.shaftManufacturer = shaftManufacturer;
	}
	public String getShaftModel() {
		return shaftModel;
	}
	public void setShaftModel(String shaftModel) {
		this.shaftModel = shaftModel;
	}
	public Integer getShaftRawWeight() {
		return shaftRawWeight;
	}
	public void setShaftRawWeight(Integer shaftRawWeight) {
		this.shaftRawWeight = shaftRawWeight;
	}
	public String getShaftFlex() {
		return shaftFlex;
	}
	public void setShaftFlex(String shaftFlex) {
		this.shaftFlex = shaftFlex;
	}
	public String getGrip() {
		return grip;
	}
	public void setGrip(String grip) {
		this.grip = grip;
	}
	
	
	
	
}
