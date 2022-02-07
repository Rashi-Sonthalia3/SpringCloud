package com.employee.util;


public class DataException extends RuntimeException{
	
	public DataException(long id)
	{
		super(String.format(Constants.DATA_NOT_FOUND,id ));
	}
	
	public DataException(String exp)
	{
		super(exp);
	}
	

}
