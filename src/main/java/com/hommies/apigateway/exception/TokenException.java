package com.hommies.apigateway.exception;

public class TokenException extends RuntimeException{
    public TokenException(String message) {
        super(message);
    }
}
