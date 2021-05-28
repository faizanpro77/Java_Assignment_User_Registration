package com.bridgelabz.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";

    public boolean validateFirstName(String firstName) {
       return patternChecker(firstName, NAME_PATTERN);
    }

    public boolean validateLastName(String lastName) {
       return patternChecker(lastName, NAME_PATTERN);
    }

    private static boolean patternChecker(String input, String inputPattern) {
        Pattern pattern = Pattern.compile(inputPattern);
        Matcher matcher =  pattern.matcher(input);
        return  matcher.find();
    }
}
