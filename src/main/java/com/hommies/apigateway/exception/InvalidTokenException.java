package com.hommies.apigateway.exception;

public class InvalidTokenException extends RuntimeException {


    public InvalidTokenException(String message) {
        super(message);
    }
}
