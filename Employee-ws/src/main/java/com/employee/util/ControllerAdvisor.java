package com.employee.util;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


public class ControllerAdvisor extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(DataException.class)
	public ResponseEntity<Object> DataNotFoundException(DataException ex, WebRequest request)
			{
				Map<String, Object> body = new LinkedHashMap<>();
				body.put("timestamp", LocalDateTime.now());
				body.put("message", "Employee not found");

				return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
			}
	

}
