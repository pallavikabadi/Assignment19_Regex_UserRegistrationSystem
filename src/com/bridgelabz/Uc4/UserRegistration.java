
package com.bridgelabz.Uc4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        UserRegistration newName = new UserRegistration();
        System.out.println("Enter First Name : ");
        String firstname = scanner.nextLine();

        System.out.println("Enter Last Name : ");
        String lastname = scanner.nextLine();

        System.out.println("Enter MailId : ");
        String email = scanner.nextLine();

        System.out.println("Enter PhoneNo : ");
        String phoneNumber = scanner.nextLine();

        newName.checkFirstName(firstname);
        newName.checkLastName(lastname);
        newName.checkEmail(email);
        newName.checkMobileNumber(phoneNumber);

    }
    //UC1:
    public void checkFirstName(String firstname){
        String regex = "^[A-Z][a-z]{3,}";

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
    //UC2:
    private void checkLastName(String lastname) {
        String regex = "^[A-Z][a-z]{3,}";

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
    //UC3:
    private void checkEmail(String email) {
        String regex = "^[a-z]*[.][a-z0-9]*(@[a-z]{5}[.][a-z]{3})$";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(email);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("Email Id is valid");
        }
        else{
            System.out.println("Email is Invalid");
        }
    }
    //UC4:
    private void checkMobileNumber(String mobileNo) {
        String regex = "^[0-9]{2,}[0-9]{10,}$";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(mobileNo);

        //checking valid or not
        if(matchChecker.matches()){
            System.out.println("Mobile Number is valid");
        }
        else{
            System.out.println("Mobile Number is Invalid");
        }
    }

}
