package com.sami.golfinventory.domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a MODEL class. It maps a row in the table 'balls' to a plain old Java object (POJO) - Ball.
 * 
 */
public class Ball{
	
	private int ballId; 
	@NotNull
	@Size(min=2, max=45)
	private String manufacturer;
	@NotNull
	@Size(min=2, max=45)
	private String model;
	@NotNull(message = "Ball amount cannot be empty")
	private Integer amount;
	
	public int getBallId() {
		return ballId;
	}
	public void setBallId(int ballId) {
		this.ballId = ballId;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
		
}
