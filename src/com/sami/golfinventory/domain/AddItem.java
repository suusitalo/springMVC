package com.sami.golfinventory.domain;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class AddItem {
	
	@NotEmpty
	String itemType;
	
	public String getItemType(){
		return itemType;
	}
	
	public void setItemType(String itemType){
		this.itemType = itemType;
	}

	
	
}


