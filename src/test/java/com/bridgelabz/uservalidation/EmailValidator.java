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
        return Arrays.asList(new Object[][]{{"abc@yahoo.com", true}, {"abc-100@yahoo.com", true}, {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true}, {"abc-100@abc.net", true}, {"abc.100@abc.com.au", true}, {"abc@1.com", true},
                {"abc+100@gmail.com", true}, {"invalid123@pole.com", true}, {"abc@.com.my", false}, {"abc123@gmail.a", false},
                {"abc123@.com", false}, {"abc123@.com.com", false}, {"abc()*@gmail.com", false} });
        }

    @Test
    public void emailChecker() {
        System.out.println("email ids -->" + this.email);
        boolean result = userRegistration.validateEmail(email);
        if(result)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(this.status, result);
    }
}
