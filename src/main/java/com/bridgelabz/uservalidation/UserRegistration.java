package com.bridgelabz.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";

    public boolean validateFirstName(String firstName) {
        return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) {
       return patternChecker(lastName, NAME_PATTERN);
    }

    public boolean validateEmail(String email) {
        return patternChecker(email, EMAIL_PATTERN);
    }

    private static boolean patternChecker(String input, String inputPattern) {
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher =  pattern.matcher(input);
        return  matcher.find();
    }
}
