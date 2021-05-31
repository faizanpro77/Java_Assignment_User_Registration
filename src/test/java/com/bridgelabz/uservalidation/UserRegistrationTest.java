package com.bridgelabz.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Faizan");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenFirstName_whenShort_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("Fa");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(false, status);
    }

    @Test
    public void givenFirstName_whenInvalid_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateFirstName("faizan");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(false, status);
    }

    @Test
    public void givenLastName_whenProper_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateLastName("Faizan");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(true, status);
    }

    @Test
    public void givenLastName_whenShort_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateLastName("Fa");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(false, status);
    }

    @Test
    public void givenLastName_whenInvalid_returnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status = userRegistration.validateLastName("arbaz");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(false, status);
    }

    @Test
    public void givenMobileNumber_whenValid_returnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean status =  userRegistration.validateMobileNumber("91 7775962642");
        if(status)
            System.out.println("Happy");
        else
            System.out.println("Sad");
        Assert.assertEquals(true, status);
    }
}

// public void testMoodAnalysis_whenSad_shouldReturnSad() {
//        UserRegistation moodAnalyser = new UserRegistation();
//        String mood = moodAnalyser.analyserMoodSad("This is a sad message");
//        Assert.assertEquals("sad", mood);
//    }
//
//    public static final String analyserMoodSad (String message)  {
//        message.contains("This is a sad message");
//        return "sad";
//    }