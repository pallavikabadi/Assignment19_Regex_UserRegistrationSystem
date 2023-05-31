package com.bridgelabz.Uc13;

@FunctionalInterface

public interface ValidateFirstName {

    public boolean validFirstname(String firstName) throws InvalidUserDetailsException;

}
