package com.sami.golfinventory.domain;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ShaftFlexValidator implements ConstraintValidator<IsValidShaftFlex, String> {

	@Override
	public void initialize(IsValidShaftFlex isValidShaftFlex){
		
	}
	
	@Override
	public boolean isValid(String shaftFlex, ConstraintValidatorContext ctx) {
		if(shaftFlex == null){
			return false;
		}
		
		if (shaftFlex.matches("L|A|R|S|X|XX|XXX|XXXX|XXXXX")){
			return true;
		}else{
			return false;
		}
	}
	
}
