package Testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P03_LoginPage;
import pages.P04_ForgetPasswordPage;

import static Testcases.TC01_Registration.email;

public class TC03_ForgetPassword extends Testbase {

    @Test(priority = 1, description = "Recovery the reset password by email")
    public void ResetPassWord_P() {

        new P04_ForgetPasswordPage(driver).Insert_forgetPassword(email).Click_RecoveryEmail_btn();
    }
}