package com.bridgelabz.uservalidation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    private static final String NAME_PATTERN = "^[A-Z][a-z]{3,}";
    private static final String EMAIL_PATTERN = "^[0-9A-Za-z]+([-_+.][0-9A-Za-z]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String MOBILE_PATTERN = "^[0-9]{2}+[ ]+[0-9]{10}$";
    private static final  String PASSWORD_PATTERN = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?!(?:.*[!@#$%^&*]){2})[a-zA-Z0-9!@#$%^&*]{8,}$";

    public boolean validateFirstName(String firstName) throws UserRegistrationInvalidException {
        try {
            return patternChecker(firstName, NAME_PATTERN);
        }catch (UserRegistrationInvalidException ex){
           throw new UserRegistrationInvalidException("Invalid firstname");
        }
        }

    public boolean validateLastName(String lastName) throws UserRegistrationInvalidException {
        try {
            return patternChecker(lastName, NAME_PATTERN);
        } catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid lastname");
        }
        }

    public boolean validateEmail(String email) throws UserRegistrationInvalidException {
        try {
            return patternChecker(email, EMAIL_PATTERN);
        } catch (UserRegistrationInvalidException ex) {
            throw new UserRegistrationInvalidException("invalid Email");
        }
        }

    public boolean validateMobileNumber(String mobileNumber) throws UserRegistrationInvalidException {
        try {
            return patternChecker(mobileNumber, MOBILE_PATTERN);
        } catch (Exception ex){
            throw new UserRegistrationInvalidException("Invalid mobile number");
        }
        }

    public boolean validatePassword(String password) {
        try {
            return patternChecker(password, PASSWORD_PATTERN);
        } catch (UserRegistrationInvalidException ex) {
            throw new UserRegistrationInvalidException("Invalid password");
        }
        }

    private static boolean patternChecker(String input, String inputPattern) throws UserRegistrationInvalidException {
        Pattern pattern = Pattern.compile(inputPattern);
        try {
            Matcher matcher = pattern.matcher(input);
            return matcher.find();
        } catch (NullPointerException ex) {
            throw new UserRegistrationInvalidException("Invalid input");
        }
    }

    public String moodAnalyseHappy(String firstName, String lastName, String email, String mobileNumber, String password) {
        if(validateFirstName(firstName) == true && validateLastName(lastName) == true && validateEmail(email) == true
        && validateMobileNumber(mobileNumber) && validatePassword(password) == true)
            return "HAPPY";
        else
            return "SAD";
    }
}
