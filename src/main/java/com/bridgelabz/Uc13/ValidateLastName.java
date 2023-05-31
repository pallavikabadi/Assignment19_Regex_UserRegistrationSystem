package com.bridgelabz.Uc13;

@FunctionalInterface

public interface ValidateLastName {
    public boolean validLastName(String lastName) throws InvalidUserDetailsException;
}
