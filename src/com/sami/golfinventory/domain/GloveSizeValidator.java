package com.sami.golfinventory.domain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GloveSizeValidator implements ConstraintValidator<IsValidGloveSize, String> {

	@Override
	public void initialize(IsValidGloveSize isValidGloveSize){
		
	}
	
	@Override
	public boolean isValid(String size, ConstraintValidatorContext ctx) {
		if(size == null){
			return false;
		}
		
		if (size.matches("XS|S|M|L|XL|XXL")){
			return true;
		}else{
			return false;
		}
	}
	
}
