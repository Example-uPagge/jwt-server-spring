package org.sadtech.example.jwt.server.exception;

public class AuthException extends RuntimeException {

    public AuthException(String message) {
        super(message);
    }

}
