
package com.bridgelabz.Uc9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        //UC9:
        String sample = "Sample email addresses:" +
                " //  1. abc@yahoo.com,\n" +
                " //• 2. abc-100@yahoo.com,\n" +
                " //• 3. abc.100@yahoo.com\n" +
                " //• 4. abc111@abc.com,\n" +
                " //• 5. abc-100@abc.net,\n" +
                " //• 6. abc.100@abc.com.au\n" +
                " //• 7. abc@1.com,\n" +
                " //• 8. abc@gmail.com.com\n" +
                " //• 9. abc+100@gmail.com";

        Pattern pattern9 = Pattern.compile("[a-z0-9.+-]+@[a-z0-9.]{2,}");
        Matcher matcher9 = pattern9.matcher(sample);
        System.out.println("Valid email addresses are :- ");
        while (matcher9.find()) {
            String email = matcher9.group();
            System.out.println(email);
        }

    }
}
