package com.mbb.bts.casa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
//		super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
		super(String.format("RECORD NOT AVAILABLE IN BTS FOR %s NO : '%s'", fieldName, fieldValue));
	}

}
