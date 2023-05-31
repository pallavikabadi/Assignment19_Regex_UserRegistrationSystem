package com.bridgelabz.Uc13;

import java.util.regex.Pattern;
/*
 * UC13: Refactor the Code to use Lambda Function to validate User Entry
 */
public class UserRegistration {
    /*
     * Use Lambda Function to validate First Name.
     */
    public static ValidateFirstName validateFirstName = (String firstName) -> {
        try {
            if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
                return true;
            } else {
                throw new InvalidUserDetailsException("Invalid First Name", InvalidUserDetailsException.ExpectedType.FIRSTNAME);
            }
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    /*
     * Use Lambda Function to validate Last Name.
     */
    public static ValidateLastName validateLastName = (String lastName) -> {
        try {

            if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", lastName)) {
                return true;
            } else
                throw new InvalidUserDetailsException("Invalid Last Name", InvalidUserDetailsException.ExpectedType.LASTNAME);
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    /*
     * Use Lambda Function to validate E-Mail .
     */
    public static ValidateEmailId validateEmailId = (String emailId) -> {
        try {
            if (Pattern.matches("^[a-z0-9.]{3,}@[a-z.]{2,}", emailId)) {
                return true;
            } else
                throw new InvalidUserDetailsException("Invalid Email Id",InvalidUserDetailsException.ExpectedType.EMAIL);
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    /*
     * Use Lambda Function to validate Mobile Number.
     */
    public static ValidateMobileNumber validateMobileNumber = (String mobileNumber) -> {
        try {
            if (Pattern.matches("^[+][0-9]{1,3}\\d{10}", mobileNumber)) {
                return true;
            } else
                throw new InvalidUserDetailsException("Invalid Mobile Number",InvalidUserDetailsException.ExpectedType.MOBILE_NUMBER);
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    /*
     * Use Lambda Function to validate Password.
     */
    public static ValidatePassword validatePassword = (String password) -> {
        try {
            if (Pattern.matches("^[A-Za-z0-9].{8,}", password)) {
                return true;
            } else
                throw new InvalidUserDetailsException("Invalid Password", InvalidUserDetailsException.ExpectedType.PASSWORD);
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
    /*
     * Use Lambda Function to validate Multiple E-mail.
     */
    public static ValidateMultipleEmail validateMultipleEmail = (String email) -> {
        try {

            if (Pattern.matches("[a-z0-9].+@[a-z0-9.]{2,}", email)) {
                return true;
            } else
                throw new InvalidUserDetailsException("Invalid Email Addresses",InvalidUserDetailsException.ExpectedType.EMAIL);
        } catch (InvalidUserDetailsException e) {
            System.out.println(e);
            e.printStackTrace();
            return false;
        }
    };
}
