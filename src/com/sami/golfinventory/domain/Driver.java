package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a MODEL class. It maps a row in the table 'drivers' to a plain old Java object (POJO) - Driver.
 * 
 */
public class Driver extends Club{
	
	private int driverId; 
	
	public Driver(){
	}
	
	public int getDriverId() {
		return driverId;
	}
	
	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}
	
}
