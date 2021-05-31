package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class PasswordValidator {

    @Test
    public void givenPassword_whenMinimum8Characters_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faiZ@178");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenPassword_when1UpperCase_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faIZ@178");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenPassword_when1Numeric_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("faIz@378");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(true,  status);
    }

    @Test
    public void givenPassword_whenExactly1SpecialCharacter_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validatePassword("fa$Iz&@378");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(false, status);
    }
}

