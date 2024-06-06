package Testcases;

import org.testng.annotations.Test;
import pages.*;

import static pages.PageBase.SCroll_deepTill_Down;

public class TC07_ShoppingCart extends Testbase {

    //Step1: define pages
    // Step2: define test data
    //Step3: Define @test
    @Test(priority = 1, description = "Create Successfully Order")
    public void CreateSuccessfullOrder_P() throws InterruptedException {

        new P01_HomePage(driver).hoverOverComputers().clickDesktops();
        new P06_Desktops(driver).Click_BuildOwnComputer();
        new P07_BuildAllProductOfDesktopPage(driver).Click_RamRadio_dropdown().Click_RamRadio_dropdown().Select_RamRadio().Click_HDD230GB().Click_AddToCart_btn();

        new P08_ShoppingCartPage(driver).Click_ShoppingCart_btn().Click_TermsAndConditiontn().Click_Checkoutbtn();

        new P09_CheckOutPage(driver).Click_Country_dropList().Select_Country_dropList().Click_StateProvince_DropList()
                .Select_StateProvince_DropList().Insert_City_txtField().Insert_Address1_txtField()
                .Insert_ZipPostalCode().Insert_PhoneNumber().Click_Continue_btn().ContinueSecond_btn().Click_ContinueThird_btn()
                .Click_ContinueFourth_btn().Click_Confirm_btn().Click_ContinueFifth_btn();
    }
}
