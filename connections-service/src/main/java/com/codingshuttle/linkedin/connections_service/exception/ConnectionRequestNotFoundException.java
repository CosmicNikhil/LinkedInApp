package com.codingshuttle.linkedin.connections_service.exception;

public class ConnectionRequestNotFoundException extends RuntimeException {
    public ConnectionRequestNotFoundException(String message) {
        super(message);
    }
}
