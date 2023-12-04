package com.hommies.apigateway.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {



    @ExceptionHandler(TokenException.class)
    public ResponseEntity<ResponseDto> handlerForTokenException(final TokenException e){
        ResponseDto response = new ResponseDto();
        response.setMessage(e.getMessage());
        response.setStatus(HttpStatus.FORBIDDEN);
        response.setStatusCode(HttpStatus.FORBIDDEN.value());
        return new ResponseEntity<>(response,HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(InvalidTokenException.class)
    public ResponseEntity<ResponseDto> handlerForInvalidTokenExceptionException(final InvalidTokenException e){
        ResponseDto response = new ResponseDto();
        response.setMessage(e.getMessage());
        response.setStatus(HttpStatus.UNAUTHORIZED);
        response.setStatusCode(HttpStatus.UNAUTHORIZED.value());
        return new ResponseEntity<>(response,HttpStatus.UNAUTHORIZED);
    }


}
