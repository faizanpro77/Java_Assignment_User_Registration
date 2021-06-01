package com.bridgelabz.uservalidation;

public class InvalidUserRegistrationException extends RuntimeException {

    String message;
    public InvalidUserRegistrationException(String message) {
        super(message);
        this.message = message;
    }
}
