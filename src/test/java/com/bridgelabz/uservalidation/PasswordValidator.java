package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidator {

    @Test
    public void givenPassword_whenMinimum8Characters_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faiz@a78");
        Assert.assertEquals(true, status);
    }
}

