package com.bridgelabz.Uc2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistration newName = new UserRegistration();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.nextLine();
        newName.checkLastName(lastName);
    }
    public void checkLastName(String lastname){
        String regex = "[A-Z][a-z]{2,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(lastname);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("Last name is valid");
        }
        else{
            System.out.println("Last Name is Invalid");
        }
    }

}
