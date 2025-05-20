package com.codingshuttle.linkedin.connections_service.exception;

public class AlreadyConnectedException extends RuntimeException {
    public AlreadyConnectedException(String message) {
        super(message);
    }
}
