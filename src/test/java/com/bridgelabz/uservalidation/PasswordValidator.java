package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidator {

    @Test
    public void givenPassword_whenMinimum8Characters_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faiZ@178");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenPassword_when1UpperCase_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faIZ@178");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenPassword_when1Numeric_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("Faez@378");
        Assert.assertEquals(true,  status);
    }

    @Test
    public void givenPassword_whenExactly1SpecialCharacter_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("Faiz@378");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenPassword_whenNull_shouldThrowInvalidMoodException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validatePassword(null);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }
}

