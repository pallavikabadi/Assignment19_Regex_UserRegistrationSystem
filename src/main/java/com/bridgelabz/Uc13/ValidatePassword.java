package com.bridgelabz.Uc13;

@FunctionalInterface
public interface ValidatePassword {

    public boolean validPasswordFormat(String password) throws InvalidUserDetailsException;
}
