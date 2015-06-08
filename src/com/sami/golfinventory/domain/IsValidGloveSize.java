package com.sami.golfinventory.domain;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = GloveSizeValidator.class)
@Target({ ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface IsValidGloveSize {
	
	String message() default "please provide a valid glove size; " +
			"Accepted sizes are : XS, S, M, L, XL, XXL ";
	
	Class<?>[] groups() default {};
	
	Class<? extends Payload>[] payload() default {};

}
