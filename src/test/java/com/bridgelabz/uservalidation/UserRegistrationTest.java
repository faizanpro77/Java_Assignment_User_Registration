package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Fakk");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenFirstName_whenShort_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Fa");
        Assert.assertEquals(false, status);
    }

    @Test
    public void givenFirst_whenInvalid_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("faizan");
        Assert.assertEquals(false, status);
    }
}
