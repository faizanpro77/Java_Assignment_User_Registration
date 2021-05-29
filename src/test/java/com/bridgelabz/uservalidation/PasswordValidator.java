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
        boolean status = userRegistration.validatePassword("faIZ@278");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenPassword_when1Numeric_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faIz@378");
        Assert.assertEquals(true,  status);
    }
}

