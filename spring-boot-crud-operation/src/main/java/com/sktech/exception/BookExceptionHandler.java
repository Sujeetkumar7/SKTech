package com.sktech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class BookExceptionHandler {

    @ExceptionHandler(value = BookNotFound.class)
    public ResponseEntity<Object> execption(BookNotFound ex){
        ExecptionResponse execptionResponse = new ExecptionResponse();
        execptionResponse.setMessage("Book Not Found");
        execptionResponse.setStatus("404");
        execptionResponse.setDate(new Date());
        return  new ResponseEntity<>(execptionResponse, HttpStatus.NOT_FOUND);
    }
}
