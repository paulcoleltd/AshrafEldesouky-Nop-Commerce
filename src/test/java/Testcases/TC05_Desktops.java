package Testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P05_ShoesPage;

public class TC05_Desktops extends Testbase{
    // Step1: define pages
    // Step2: define test data
    //Step3: Define @test

    P01_HomePage homePage;

    @Test(priority = 1, description = "Select Red Radio Button")
    public void Select_Desktop_P() throws InterruptedException {
       new P01_HomePage(driver).hoverOverComputers().clickDesktops();
    }
}
