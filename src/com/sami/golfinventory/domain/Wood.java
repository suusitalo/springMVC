package com.sami.golfinventory.domain;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Wood extends Club{

	private int woodId;
	private Integer woodNumber;
		
	public Wood(){
	}
	public int getWoodId() {
		return woodId;
	}

	public void setWoodId(int woodId) {
		this.woodId = woodId;
	}

	public Integer getWoodNumber() {
		return woodNumber;
	}

	public void setWoodNumber(Integer woodNumber) {
		this.woodNumber = woodNumber;
	}

}
