package com.coforge.exception;

public class CountryNotAvailableException extends RuntimeException{
	
	
	public CountryNotAvailableException(String message){
		super(message);
	}
	
	public CountryNotAvailableException(String message, Throwable cause) {
        super(message, cause);
    }
    public CountryNotAvailableException(Throwable cause) {
        super(cause);
    }

}
