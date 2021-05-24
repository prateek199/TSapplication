package com.dinesh.tatasky.controller;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.dinesh.tatasky.exception.NotFoundException;

@ControllerAdvice
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<Object> handleNotFoundException(NotFoundException ex, WebRequest request) {
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
	@ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleException(NotFoundException ex, WebRequest request) {
        return new ResponseEntity<>("Some server error occured", HttpStatus.INTERNAL_SERVER_ERROR);
    }
	
	

}
