package Testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P05_ShoesPage;

public class TC04_Shoes extends Testbase {

    // Step1: define pages
    // Step2: define test data
    //Step3: Define @test


    @Test(priority = 1, description = "Select Red Radio Button")
    public void Select_RedDatioButton_shoes_P() {

        new P01_HomePage(driver).hoverOverApparel().clickshoes();
        new P05_ShoesPage(driver).Click_RedRadioButton();

    }
}
