package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;

import java.util.ArrayList;

import static java.sql.DriverManager.getDriver;
import static util.Utility.*;
import static util.Utility.generatePassword;

public class TC01_Registration extends Testbase{

    P01_HomePage homePage;
    P02_RegistrationPage registrationPage;

    // define test data
    String firstName = getRandomFirstName();
    String lastName = "Mohamed";
    static String email = generateRandomEmail();
    String comapnyName = generateCompanyName();
    static String password = generatePassword(8);


    @Test(priority = 1, description = "Register New User With Valid Data")
    public void registerNewUserWithValidData_P() throws InterruptedException {
        firstName = getRandomFirstName();
        lastName = "Mohamed";
        email = generateRandomEmail();
        ArrayList<String> emailList = new ArrayList<>();
        emailList.add(email);
        if (emailList.contains(email)) {
            System.out.println(email+"  Email is a duplicate");
            email = generateRandomEmail();
        }
        else {
            System.out.println(email+"  Email is not a duplicate");
        }
        comapnyName = generateCompanyName();
        password = generatePassword(8);


        new P01_HomePage(driver).clickRegisterTap();
        new P02_RegistrationPage(driver).registerNewUser(firstName, lastName, email, comapnyName, password);
        Assert.assertTrue(new P02_RegistrationPage(driver).VerifyRegisterSucessfully());
        new P01_HomePage(driver).clickLogoutTap();
    }

    @Test(priority = 2,description = "Register New User With Invalid Email")
    public void registerNewUserWithValidData_N() throws InterruptedException {
        email = "asmohamed.com";

        new P01_HomePage(driver).clickRegisterTap();
        new P02_RegistrationPage(driver).registerNewUser(firstName, lastName, email, comapnyName, password);
    }

}
