package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    @Test
    void givenFirstNameHappyTest() throws InvalidUserDetailsException {
        //Valid First Name
            boolean actualFirstName = UserRegistration.validateFirstName.validFirstname("Drisya");
            Assertions.assertTrue(actualFirstName);
            System.out.println("Valid First Name");
        }
    @Test
    void givenLastNameHappyTest() throws InvalidUserDetailsException {
        //Valid Last Name
        boolean actualLastName = UserRegistration.validateLastName.validLastName("Athul");
        Assertions.assertTrue(actualLastName);
        System.out.println("Valid Last Name");
    }
    @Test
    void givenEmailIdHappyTest() throws InvalidUserDetailsException {
       // Valid Email Id
        boolean actualEmail = UserRegistration.validateEmailId.validEmailId("abc.xyz@bl.co.in");
        Assertions.assertTrue(actualEmail);
        System.out.println("Valid Email-Id");
    }
    @Test
    void givenMobileFormatHappyTest() throws InvalidUserDetailsException {
        // Test Valid Mobile Format
        boolean actualMobileFormat = UserRegistration.validateMobileNumber.validMobileFormat("+91 9874563210");
        Assertions.assertTrue(actualMobileFormat);
        System.out.println("Valid Mobile Format");
    }
    @Test
    void givenPasswordMinimum8CharactersHappyTest() throws InvalidUserDetailsException {
        // Test Valid Password-Rule1
        boolean actualPasswordFormat = UserRegistration.validatePassword.validPasswordFormat("secretpassword");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule1 Format");
    }
    @Test
    void givenPasswordAtLeastOneUpperCaseHappyTest() throws InvalidUserDetailsException {
        // Test Valid Password at least one Upper Case-Rule2
        boolean actualPasswordFormat = UserRegistration.validatePassword.validPasswordFormat("SecretPassword");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule2 Format");
    }
    @Test
    void givenPasswordAtLeastOneNumericNumberHappyTest() throws InvalidUserDetailsException {
        // Test Valid Password at least one Numeric number-Rule3
        boolean actualPasswordFormat = UserRegistration.validatePassword.validPasswordFormat("Secret123Password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule3 Format");
    }
    @Test
    void givenPasswordHasOneSpecialCharacterHappyTest() throws InvalidUserDetailsException {
        // Test Valid Password should have one special character-Rule4
        boolean actualPasswordFormat = UserRegistration.validatePassword.validPasswordFormat("Secret123_Password");
        Assertions.assertTrue(actualPasswordFormat);
        System.out.println("Valid Password-Rule4 Format");
    }
    @Test
    void givenAllEmailSamplesHappyTest() throws InvalidUserDetailsException {
        /*
            UC9: Test all Email Samples
        */
        boolean actualEmail1 = UserRegistration.validateMultipleEmail.validEmail("abc@yahoo.com");
        Assertions.assertTrue(actualEmail1);
        System.out.println("Valid Email Address-1");

        boolean actualEmail2 = UserRegistration.validateMultipleEmail.validEmail("abc-100@yahoo.com");
        Assertions.assertTrue(actualEmail2);
        System.out.println("Valid Email Address-2");

        boolean actualEmail3 = UserRegistration.validateMultipleEmail.validEmail("abc.100@yahoo.com");
        Assertions.assertTrue(actualEmail3);
        System.out.println("Valid Email Address-3");

        boolean actualEmail4 = UserRegistration.validateMultipleEmail.validEmail("abc111@abc.com");
        Assertions.assertTrue(actualEmail4);
        System.out.println("Valid Email Address-4");

        boolean actualEmail5 = UserRegistration.validateMultipleEmail.validEmail("abc-100@abc.net");
        Assertions.assertTrue(actualEmail5);
        System.out.println("Valid Email Address-5");

        boolean actualEmail6 = UserRegistration.validateMultipleEmail.validEmail("abc.100@abc.com.au");
        Assertions.assertTrue(actualEmail6);
        System.out.println("Valid Email Address-6");

        boolean actualEmail7 = UserRegistration.validateMultipleEmail.validEmail("abc@1.com");
        Assertions.assertTrue(actualEmail7);
        System.out.println("Valid Email Address-7");

        boolean actualEmail8 = UserRegistration.validateMultipleEmail.validEmail("abc@gmail.com.com");
        Assertions.assertTrue(actualEmail8);
        System.out.println("Valid Email Address-8");

        boolean actualEmail9 = UserRegistration.validateMultipleEmail.validEmail("abc+100@gmail.com");
        Assertions.assertTrue(actualEmail9);
        System.out.println("Valid Email Address-9");

    }
}
