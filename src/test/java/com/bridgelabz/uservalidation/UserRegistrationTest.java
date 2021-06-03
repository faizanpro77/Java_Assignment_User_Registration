package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Shaikh");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenFirstName_whenShort_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
            boolean status = userRegistration.validateFirstName("Fa");
            Assert.assertEquals(false, status);
    }

    @Test
    public void givenFirstName_whenInvalid_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
            boolean status = userRegistration.validateFirstName("faizan");
            Assert.assertEquals(false, status);
        }

    @Test
    public void givenFirstName_whenNull_shouldThrowInvalidMoodException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateFirstName(null);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals("Invalid firstname", ex.getMessage());
        }
    }

    @Test
    public void givenLastName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateLastName("Faizan");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenLastName_whenShort_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
            boolean status = userRegistration.validateLastName("Fa");
            Assert.assertEquals(false, status);
        }


    @Test
    public void givenLastName_whenInvalid_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
            boolean status = userRegistration.validateLastName("arbaz");
            Assert.assertEquals(false, status);
        }

    @Test
    public void givenLastName_whenNull_shouldThrowInvalidMoodException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateLastName(null);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }


    @Test
    public void givenMobileNumber_whenValid_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status =  userRegistration.validateMobileNumber("91 7775962642");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenMobileNumber_whenShort_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
            boolean status = userRegistration.validateMobileNumber("91 77759626");
            Assert.assertEquals(false, status);
    }

    @Test
    public void givenMobileNumber_whenNotProper_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
            boolean status = userRegistration.validateMobileNumber("917775962645564");
            Assert.assertEquals(false, status);
    }

    @Test
    public void givenMobileNumber_whenNull_shouldThrowInvalidMoodException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            userRegistration.validateMobileNumber(null);
        } catch (UserRegistrationInvalidException ex) {
            Assert.assertEquals(UserRegistrationInvalidException.class, ex.getClass());
        }
    }

    @Test
    public void givenMood_whenHappy_returnHappy() {
        UserRegistration userRegistration = new UserRegistration();
        String mood = userRegistration.moodAnalyseHappy("Saikh","Faizan","faizyshaikh@gmail.com","91 7775962642","faIz@378" );
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenMood_whenSad_returnHappy() {
    UserRegistration userRegistration = new UserRegistration();
    String mood = userRegistration.moodAnalyseHappy("saikh","faizan","fai@hzyshaikh@gmail.com","911 777455962642","fa&$Iz@378");
    Assert.assertEquals("SAD", mood);
    }
}
