package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Club extends Shaft{
	
	@NotNull
	@Size(min=2, max=45)
	private String manufacturer;
	@NotNull
	@Size(min=2, max=45)
	private String model;
	@NotNull
	@Min(4)
	@Max(12)
	private Integer loft;
	
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
	public Integer getLoft() {
		return loft;
	}
	public void setLoft(Integer loft) {
		this.loft = loft;
	}
}
