
package com.bridgelabz.Uc8;

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

        System.out.println("Enter Password : ");
        String password = scanner.nextLine();

        newName.checkFirstName(firstname);
        newName.checkLastName(lastname);
        newName.checkEmail(email);
        newName.checkMobileNumber(phoneNumber);
        newName.checkPasswordRule(password);
        newName.checkPasswordRule2(password);
        newName.checkPasswordRule3(password);
        newName.checkPasswordRule4(password);



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

    //UC5:
    private void checkPasswordRule(String password) {
        String regex = "^[a-zA-Z]{8,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(password);

        //checking valid or not
        if (matchChecker.matches()) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    //UC6:
    private void checkPasswordRule2(String password) {
        String regex = "^[A-Za-z]{8,}$";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(password);

        //checking valid or not
        if (matchChecker.matches()) {
            System.out.println("Password For Rule2 is valid");
        } else {
            System.out.println("Password For Rule2 is Invalid");
        }
    }

    //UC7:
    private void checkPasswordRule3(String password) {
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(password);

        //checking valid or not
        if (matchChecker.matches()) {
            System.out.println("Password For Rule3 is valid");
        } else {
            System.out.println("Password For Rule3 is Invalid");
        }
    }

    //UC8:
    private void checkPasswordRule4(String password) {
        String regex = "^(?=[a-z]*[A-Z])(?=.*[0-9])(?=.*[\\W_]).{8,}$";

        Pattern patternChecker = Pattern.compile(regex);
        Matcher matchChecker = patternChecker.matcher(password);

        //checking valid or not
        if (matchChecker.matches()) {
            System.out.println("Password For Rule4 is valid");
        } else {
            System.out.println("Password For Rule4 is Invalid");
        }
    }
}
