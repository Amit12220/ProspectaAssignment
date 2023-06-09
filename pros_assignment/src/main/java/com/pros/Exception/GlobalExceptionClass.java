package com.pros.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionClass {
	
	@ExceptionHandler(EntryDataException.class)
	public ResponseEntity<MyErrorDetails> EntryException(EntryDataException e,WebRequest w)
	{
		MyErrorDetails edtails=new MyErrorDetails();
		edtails.setLdt(LocalDateTime.now());
		edtails.setMessage(e.getMessage());
		edtails.setDesc(w.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(edtails,HttpStatus.OK);
		
	}

	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> Exception(Exception e,WebRequest w)
	{
		MyErrorDetails edtails=new MyErrorDetails();
		edtails.setLdt(LocalDateTime.now());
		edtails.setMessage(e.getMessage());
		edtails.setDesc(w.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(edtails,HttpStatus.OK);
		
	}
	
}
