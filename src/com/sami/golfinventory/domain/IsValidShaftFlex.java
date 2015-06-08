package com.sami.golfinventory.domain;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = ShaftFlexValidator.class)
@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface IsValidShaftFlex {
	
	String message() default "please provide a valid shaft flex; " +
			"Accepted flexes are : L, A, R, S, X, XX, XXX, XXXX, XXXXX ";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}
