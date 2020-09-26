package com.techass.prodcutpriceoptimizer.exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class ApiException {

    private final String name ;

    private final HttpStatus httpStatus;

    private final ZonedDateTime timestamp;

    public ApiException(String name, HttpStatus httpStatus, ZonedDateTime timestamp) {
        this.name = name;
        this.httpStatus = httpStatus;
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }
}
