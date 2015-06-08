package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a MODEL class. It maps a row in the table 'wedges' to a plain old Java object (POJO) - Wedge.
 * 
 */
public class Wedge extends Club{
	
	private int wedgeId; 
	@NotNull(message = "Enter bounce between 2 and 20 degrees.")
	@Min(value = 2, message = "Enter bounce between 2 and 20 degrees.")
	@Max(value = 2, message = "Enter bounce between 2 and 20 degrees.")
	private Integer bounce;
	
	public Wedge(){
	}

	public int getWedgeId() {
		return wedgeId;
	}
	public void setWedgeId(int wedgeId) {
		this.wedgeId = wedgeId;
	}
	public Integer getBounce() {
		return bounce;
	}
	public void setBounce(Integer bounce) {
		this.bounce = bounce;
	}
	
}
