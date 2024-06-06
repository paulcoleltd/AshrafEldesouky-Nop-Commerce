package Testcases;

import org.testng.annotations.Test;
import pages.PageBase;

public class TC08_SearchForItem extends Testbase{

    // Step1: define pages
    // Step2: define test data
    //Step3: Define @test


    @Test(priority = 1, description = "Search for item")
    public void SearchForItem_P() {

        new PageBase(driver).Insert_SearchItem_up("Computer").Click_SearchButtonUp();

    }
}
