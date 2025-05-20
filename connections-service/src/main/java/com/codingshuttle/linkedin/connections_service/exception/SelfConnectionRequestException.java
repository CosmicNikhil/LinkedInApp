package com.codingshuttle.linkedin.connections_service.exception;

public class SelfConnectionRequestException extends RuntimeException {
    public SelfConnectionRequestException(String message) {
        super(message);
    }
}
