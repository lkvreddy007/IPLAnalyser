package com.capg.dto;

public class IPLAnalyserException extends Exception {
	
	public enum ExceptionType{
		INVALID_FILE_FORMAT, CENSUS_FILE_PROBLEM, UNABLE_TO_PARSE, NULL_VALUES_ENCOUNTERED, ERROR_IN_FILE;
	}
	
	ExceptionType exceptionType;
	
	public IPLAnalyserException(String message, ExceptionType exceptionType) {
		super(message);
		this.exceptionType = exceptionType;
	}
	
}
