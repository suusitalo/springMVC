package com.sami.golfinventory.domain;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a MODEL class. It maps a row in the table 'gloves' to a plain old Java object (POJO) - Glove.
 * 
 */
public class Glove{
	
	private int gloveId; 
	@NotNull
	@Size(min=2, max=45)
	private String manufacturer;
	@NotNull
	@Size(min=2, max=45)
	private String model;
	@IsValidGloveSize
	private String size;
	
	@NotNull(message = "Glove amount cannot be empty")
	private Integer amount;
	
	public int getGloveId() {
		return gloveId;
	}
	public void setGloveId(int gloveId) {
		this.gloveId = gloveId;
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
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
		
}
