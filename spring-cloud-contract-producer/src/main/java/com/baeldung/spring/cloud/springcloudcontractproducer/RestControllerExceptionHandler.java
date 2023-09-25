package com.baeldung.spring.cloud.springcloudcontractproducer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.validation.ConstraintViolationException;

@RestControllerAdvice
public class RestControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Void> handlerDomainException(ConstraintViolationException e) {
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

}
