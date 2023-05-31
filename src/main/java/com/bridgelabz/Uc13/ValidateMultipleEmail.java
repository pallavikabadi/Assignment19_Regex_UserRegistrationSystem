package com.bridgelabz.Uc13;

@FunctionalInterface
public interface ValidateMultipleEmail {

    public boolean validEmail(String email) throws InvalidUserDetailsException;
}
