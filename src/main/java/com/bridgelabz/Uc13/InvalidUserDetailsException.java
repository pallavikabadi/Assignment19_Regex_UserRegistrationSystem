package com.bridgelabz.Uc13;

public class InvalidUserDetailsException extends Exception{

    public ExpectedType type;

    public enum ExpectedType{
        FIRSTNAME, LASTNAME, MOBILE_NUMBER, EMAIL, PASSWORD
    }
    public InvalidUserDetailsException(String message, ExpectedType type) {
        /*
         * constructor with a String parameter
         * call the super constructor and pass the message
         */
        super(message);
        this.type = type;
    }
}
