package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/*
 * This is a MODEL class. It maps a row in the table 'irons' to a plain old Java object (POJO) - Iron.
 * 
 */
public class Iron extends Club{
	
	private int ironId; 
	
	@NotNull
	@Min(1)
	@Max(9)
	private int ironNumber;
	
	public Iron(){
	}

	public int getIronId() {
		return ironId;
	}
	public void setIronId(int ironId) {
		this.ironId = ironId;
	}
	public int getIronNumber() {
		return ironNumber;
	}
	public void setIronNumber(int ironNumber) {
		this.ironNumber = ironNumber;
	}
	
}
