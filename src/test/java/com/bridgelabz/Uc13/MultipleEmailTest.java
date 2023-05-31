package com.bridgelabz;

import com.bridgelabz.Uc13.InvalidUserDetailsException;
import com.bridgelabz.Uc13.UserRegistration;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultipleEmailTest {
    /*
     UC11: Parameterized test to validate multiple entry for the Email Addresses
     */
    private String emailId;
    private boolean expectedResult;
    static UserRegistration userRegistration;

    public MultipleEmailTest(String emailId, boolean expectedResult) {
        /*
         Parameterized Constructor
         */
        this.emailId = emailId;
        this.expectedResult = expectedResult;

    }
    @Before
    public void initialize(){
        userRegistration = new UserRegistration();
    }

    @Parameterized.Parameters
    public static Collection input() {

        return Arrays.asList(new Object[][]{{"abc@yahoo.com",true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com",true},{"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},{"abc@gmail.com.com",true},{"abc+100@gmail.com",true}});

    }
    @Test
    public void givenEmailHappyTest()  throws InvalidUserDetailsException {
        boolean actualEmail = UserRegistration.validateMultipleEmail.validEmail(emailId);
        Assert.assertEquals(expectedResult,actualEmail);
        System.out.println("Email Successfully Validate.");
    }
}