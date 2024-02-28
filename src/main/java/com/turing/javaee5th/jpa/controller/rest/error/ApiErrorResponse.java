package com.turing.javaee5th.jpa.controller.rest.error;

import lombok.Data;

@Data
public class ApiErrorResponse{
	String errorCode;
	String message;
	
	public ApiErrorResponse(String errorCode,String message)
	{
		this.errorCode = errorCode;
		this.message = message;
	}
}
