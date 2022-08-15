package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.support.WebRequestDataBinder;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(InvalidId.class)
	public ResponseEntity<MyErrorDetails> myExpHandler1(InvalidId ie,WebRequest wr)
	{
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
	    return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(DriverNotFoundException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler4(DriverNotFoundException ie, WebRequest wr){
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(),ie.getMessage(),wr.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(AdminExceptions.class)
	public ResponseEntity<MyErrorDetails> myExpHandler4(AdminExceptions ae, WebRequest wr){
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(),ae.getMessage(),wr.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err,HttpStatus.CONFLICT);
	}
	
	
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler2(NoHandlerFoundException e,WebRequest wr)
	{
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(),e.getMessage(),wr.getDescription(false));
	    return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);

	}
	
	
	
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> myExpHandler3(MethodArgumentNotValidException me) {
	MyErrorDetails err=new MyErrorDetails(LocalDateTime.now(),"Validation Error",me.getBindingResult().getFieldError().getDefaultMessage());
	return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
	
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExpHandler(Exception e,WebRequest wr)
	{
		MyErrorDetails err= new MyErrorDetails(LocalDateTime.now(),e.getMessage(),wr.getDescription(false));
	    return new ResponseEntity<MyErrorDetails>(err,HttpStatus.BAD_REQUEST);

	}

}
