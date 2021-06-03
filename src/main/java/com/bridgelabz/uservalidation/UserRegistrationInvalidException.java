package com.bridgelabz.uservalidation;

public class UserRegistrationInvalidException extends RuntimeException {
    String message;
    public UserRegistrationInvalidException(String message) {
        super(message);
        this.message = message;
    }
}
