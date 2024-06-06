package Testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;
import pages.P06_Desktops;
import pages.P07_BuildAllProductOfDesktopPage;

import static pages.PageBase.SCrollDown;

public class TC06_BuildAllProducts extends Testbase {


    @Test(priority = 1, description = "Add Own computer To Cart")
    public void AddTheOwnComputerToCart() throws InterruptedException {
        new P01_HomePage(driver).hoverOverComputers().clickDesktops();
        new P06_Desktops(driver).Click_BuildOwnComputer();
        new P07_BuildAllProductOfDesktopPage(driver).Click_RamRadio_dropdown().Select_RamRadio().Click_HDD230GB().Click_AddToCart_btn();
    }

    @Test(priority = 2, description = "Add DigitalStorm Product2 ToWatchList")
    public void AddDigitalStorm_ToWatchListProduct2_P() throws InterruptedException {
        new P01_HomePage(driver).hoverOverComputers().clickDesktops();
        new P06_Desktops(driver).Click_DigitalStorm();
        new P07_BuildAllProductOfDesktopPage(driver).Click_AddToWatchListProduct2btn();
    }

    @Test(priority = 3, description = "Add Lenovo Product3 Comparelist")
    public void AddLenovo_ToCompareListProduct3_P() throws InterruptedException {
        new P01_HomePage(driver).hoverOverComputers().clickDesktops();
        new P06_Desktops(driver).Click_LenovoIdeaCentre();
        new P07_BuildAllProductOfDesktopPage(driver).Click_AddToCompateListProduct3btn();
    }

    @Test(priority = 4, description = "Add_HoverCategory_HoverSubCategory ToWatchList")
    public void Add_HoverCategory_HoverSubCategory_ToWatchListProduct2_P() throws InterruptedException {
        new P01_HomePage(driver).selectHover_FirstThreeCategory().Select_WithHoverSubCategories();

    }
}
