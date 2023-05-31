package com.bridgelabz.Uc13;

@FunctionalInterface
public interface ValidateEmailId {

    public boolean validEmailId(String emailId) throws InvalidUserDetailsException;
}
