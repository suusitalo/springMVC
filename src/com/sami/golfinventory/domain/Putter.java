package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a MODEL class. It maps a row in the table 'putters' to a plain old Java object (POJO) - Putter.
 * 
 */
public class Putter extends Club{
	
	private int putterId; 
	@NotNull(message = "Select shaft length between 20 and 38 inches.")
	@Min(value = 20, message = "Select shaft length between 20 and 38 inches.")
	@Max(value = 38, message = "Select shaft length between 20 and 38 inches.")
	private Integer shaftLength;

	private String grip;
	
	public Putter(){
	}
	public int getPutterId() {
		return putterId;
	}
	public void setPutterId(int putterId) {
		this.putterId = putterId;
	}
	public Integer getShaftLength() {
		return shaftLength;
	}
	public void setShaftLength(Integer shaftLength) {
		this.shaftLength = shaftLength;
	}

}
