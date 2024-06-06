package Testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P02_RegistrationPage;
import pages.P03_LoginPage;

import static Testcases.TC01_Registration.email;
import static Testcases.TC01_Registration.password;

public class TC02_Login extends Testbase{


    // define test data

    @Test(priority = 1, description = "Login to System with Valid Data")
    public void loginWithValidData_P() throws InterruptedException {

        if (driver == null)
            System.out.println("driver = null");

        new P01_HomePage(driver).clickLoginTap();
        new P03_LoginPage(driver).inputEmail(email).inputPassword(password).clickLoginButton();
        System.out.println(email+" "+ password);
        Assert.assertTrue(new P03_LoginPage(driver).VerifyloginSucessfully());
        //email and password coming from registeration these 2 variable are static in registeration page
        //and imported here

    }
    @Test(priority = 2, description = "Login to System with Invalid email and Invalid password")
    public void loginWithInvalidData_N() {
        email = "demo@demo.com";
        new P01_HomePage(driver).clickLoginTap();
        new P03_LoginPage(driver).inputEmail(email).inputPassword(password).clickLoginButton();
    }

    @Test(priority = 7,description = "Check Login tap clickable ")
    public void Check_ForgetPassword_Clickable(){
        new P03_LoginPage(driver).Click_forgetPassword();
    }
}
