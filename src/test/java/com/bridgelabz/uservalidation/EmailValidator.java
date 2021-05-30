package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidator {
    public String email;
    public boolean status;
    UserRegistration userRegistration = new UserRegistration();
    public EmailValidator(String email, boolean status) {
        this.email = email;
        this.status = status;
    }
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc123@.com", false},
                {"abc123@.com.com", false} });
    }

    @Test
    public void emailChecker() {
        System.out.println("email ids -->" + this.email);
        boolean result = userRegistration.validateEmail(email);
        Assert.assertEquals(this.status, result);
    }
}

