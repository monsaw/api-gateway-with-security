package com.hommies.apigateway.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;

import java.net.http.HttpHeaders;
import java.time.LocalDateTime;

@Data
public class ResponseDto {

    private String message;
    private int statusCode;
    private HttpStatus status;
    private LocalDateTime localDateTime = LocalDateTime.now();
}
