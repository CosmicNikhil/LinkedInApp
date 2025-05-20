package com.codingshuttle.linkedin.connections_service.exception;

public class ConnectionRequestAlreadyExistsException extends RuntimeException {
    public ConnectionRequestAlreadyExistsException(String message) {
        super(message);
    }
}
