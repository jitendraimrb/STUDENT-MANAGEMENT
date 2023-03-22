package com.coforge.exception;

import java.time.LocalDateTime;
import java.util.Collections;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class StudentResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	

@ExceptionHandler(CountryNotAvailableException.class)
public ResponseEntity<ErrorResponseAPI> handleException(CountryNotAvailableException ex){
	
	ErrorResponseAPI errorResponseAPI = ErrorResponseAPI.builder().timeStaTime(LocalDateTime.now())
			.httpStatus(HttpStatus.NO_CONTENT).code(HttpStatus.BAD_REQUEST.value()).message("Client Error")
			.details(Collections.singletonList(ex.getMessage())).build();
	return new ResponseEntity<ErrorResponseAPI>(errorResponseAPI, HttpStatus.BAD_REQUEST);
}
	
}
