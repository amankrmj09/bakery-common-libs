package com.blubugtech.common.exception.common;

import org.springframework.http.HttpStatus;

public class FeignClientException extends RuntimeException {
    private final HttpStatus httpStatus;

    public FeignClientException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
