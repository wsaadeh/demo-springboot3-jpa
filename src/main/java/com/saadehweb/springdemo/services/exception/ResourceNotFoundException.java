package com.saadehweb.springdemo.services.exception;

public class ResourceNotFoundException extends RuntimeException {

//    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. Id " + id);
    }
}
