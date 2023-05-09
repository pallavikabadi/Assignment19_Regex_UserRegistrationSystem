package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistration newName = new UserRegistration();
        System.out.println("Enter First Name : ");
        String firstName = scanner.nextLine();
        newName.checkFirstName(firstName);
    }
    public void checkFirstName(String firstname){
        String regex = "[A-Z]{1}[a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(firstname);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("First name is valid");
        }
        else{
            System.out.println("First Name is Invalid");
        }
    }
}
