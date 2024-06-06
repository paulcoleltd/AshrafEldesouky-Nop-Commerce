package Testcases;

import org.testng.annotations.Test;
import pages.P01_HomePage;

import static util.Utility.getRandom_FirstThreeCategories;

public class TC00_Home extends Testbase{

    P01_HomePage homePage;

    @Test(priority = 1, description = "Switch to Euro Currency")
    public void SwitchCurrencyToEuro_P() {
        new P01_HomePage(driver).click_CurrencyDropDownList().SelectEuroCurrency();
    }

    @Test(priority = 2, description = "Select Different Categories")
    public void SelectRandomDifferentCategories_P() {
        new P01_HomePage(driver).click_RandomdifferentCategories();
    }


    @Test(priority = 3, description = "Select Different FirstThree Categories")
    public void SelectRandomFirstThreeCategories_P() {

        String theSelectItem_fromThree=getRandom_FirstThreeCategories();

        if (theSelectItem_fromThree == "Computers ") {
            new P01_HomePage(driver).hoverOverComputers().click_Randomdifferent_SubCategory_From_computerCategory();
        }
        else if (theSelectItem_fromThree== "Electronics ") {
            new P01_HomePage(driver).hoverOverElectronics().click_Randomdifferent_SubCategory_From_ElectronicsCategory();
        }
        else if (theSelectItem_fromThree == "Apparel ") {
            new P01_HomePage(driver).hoverOverApparel().click_Randomdifferent_SubCategory_From_ApparelCategory();
        }

    }

    @Test(priority = 4, description = "Select Random SubCategory_From_computerCategory")
    public void SelectRandom_FromCOmputerCategory_P() {
        new P01_HomePage(driver).hoverOverComputers().click_Randomdifferent_SubCategory_From_computerCategory();
    }

    @Test(priority = 5, description = "Select Random SubCategory_From_computerCategory")
    public void SelectRandomDifferentElectronic_P() {
        new P01_HomePage(driver).hoverOverElectronics().click_Randomdifferent_SubCategory_From_ElectronicsCategory();
    }

    @Test(priority = 6, description = "Select Different Categories")
    public void SelectRandomDifferentApparel_P() {
        new P01_HomePage(driver).hoverOverApparel().click_Randomdifferent_SubCategory_From_ApparelCategory();
    }

    @Test(priority = 7, description = "Open Shoes page")
    public void OpenshoesPAge_P() throws InterruptedException {
        new P01_HomePage(driver).hoverOverApparel().clickshoes_SUBcategory_Button();
    }

    @Test(priority = 7,description = "Check Login tap clickable ")
    public void Check_LoginTabClickable(){
        new P01_HomePage(driver).clickLoginTap();
    }

}