package com.bridgelabz.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{2}+[ ]+[0-9]{10}$";
    private static final  String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";

    public boolean validateFirstName(String firstName) {
        System.out.println("firstName : " + firstName);
        try {
            return patternChecker(firstName, NAME_PATTERN);
        } catch (Exception ex) {
        throw new InvalidUserRegistrationException("Invalid name enter correct name");
        }
    }
    public boolean validateLastName(String lastName) {
        System.out.println("lastName : "+lastName);
        return patternChecker(lastName, NAME_PATTERN);
    }

    public boolean validateEmail(String email) {
        return patternChecker(email, EMAIL_PATTERN);
    }

    public boolean validateMobileNumber(String mobileNumber) {
        System.out.println("MobileNumber : "+mobileNumber);
        return patternChecker(mobileNumber, MOBILE_PATTERN);
    }

    public boolean validatePassword(String password) {
        System.out.println("Password : "+password);
        return patternChecker(password, PASSWORD_PATTERN);
    }

    private static boolean patternChecker(String input, String inputPattern) {
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher =  pattern.matcher(input);
        return  matcher.find();
    }
}
