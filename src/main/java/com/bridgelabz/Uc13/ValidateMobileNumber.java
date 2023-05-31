package com.bridgelabz.Uc13;

@FunctionalInterface
public interface ValidateMobileNumber {

    public boolean validMobileFormat(String mobileNumber) throws InvalidUserDetailsException;
}
