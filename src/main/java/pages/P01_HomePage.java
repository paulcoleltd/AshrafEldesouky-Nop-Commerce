package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import static pages.PageBase.hoverElement;
import static util.Utility.*;

public class P01_HomePage {
    // constructor
    // Locators
    // Action Methods


    // Action Methods
    WebDriver driver;
    public P01_HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private final By LOGINTAP_BUTTON = By.xpath("//a[text()='Log in']");
    private final By LOG_OUTab_BUTTON = By.xpath("//a[text()='Log out']");
    private final By Register_Tab_BUTTON = By.xpath("//a[text()='Register']");

    private final By SwitchToEuro_DropDownList = By.xpath("//select[@id='customerCurrency']");

    private final By Apparel_category_Button = By.xpath("(//a[text()='Apparel '])[1]");

    private final By Computers_category_Button = By.xpath("(//a[text()='Computers '])[1]");
    private final By Desktops_category_Button = By.xpath("(//a[text()='Desktops '])[1]");

    private final By Electronics_category_Button = By.xpath("(//a[text()='Electronics '])[1]");
    private final By Digitaldownloads_category_Button = By.xpath("(//a[text()='Digital downloads '])[1]");
    private final By Jewelry_category_Button = By.xpath("(//a[text()='Jewelry '])[1]");
    private final By GiftCards_category_Button = By.xpath("(//a[text()='Gift Cards '])[1]");
    private final By ShoppingCart_category_Button = By.xpath("//span[text()='Shopping cart']");
    private final By shoes_SUBcategory_Button = By.xpath("(//a[text()='Shoes '])[1]");
    private final By shoes = By.xpath("(//a[text()='Shoes '])[1]");

    public P01_HomePage clickLoginTap() {
        driver.findElement(this.LOGINTAP_BUTTON).click();
        return this;
    }


    public P01_HomePage clickLogoutTap() {
        driver.findElement(this.LOG_OUTab_BUTTON).click();
        return this;
    }

    public P01_HomePage clickRegisterTap() {
        driver.findElement(this.Register_Tab_BUTTON).click();
        return this;
    }

    public P01_HomePage clickDesktops() throws InterruptedException {
        PageBase.ThreadSleep2000();
        driver.findElement(this.Desktops_category_Button).click();
        return this;
    }

    public P01_HomePage clickShoppingCart() {
        driver.findElement(this.ShoppingCart_category_Button).click();
        return this;
    }
    public P01_HomePage clickshoes() {
        driver.findElement(this.shoes).click();
        return this;
    }

    public P01_HomePage click_CurrencyDropDownList() {
        driver.findElement(this.SwitchToEuro_DropDownList).click();
        return this;
    }
    public P01_HomePage clickshoes_SUBcategory_Button() {
        driver.findElement(this.shoes_SUBcategory_Button).click();
        return this;
    }
    public P01_HomePage SelectEuroCurrency() {
        Select dropdown = new Select(driver.findElement(this.SwitchToEuro_DropDownList));
        // Select option by visible text
        dropdown.selectByVisibleText("Euro");
        return this;
    }

    public P01_HomePage SelectUSDCurrency() {
        Select dropdown = new Select(driver.findElement(this.SwitchToEuro_DropDownList));
        // Select option by visible text
        dropdown.selectByVisibleText("US Dollar");
        return this;
    }

    public P01_HomePage hoverOverComputers() {
        WebElement element = driver.findElement(Computers_category_Button);
        hoverElement(driver, element);
        return this;
    }

    public P01_HomePage hoverOverElectronics() {
        WebElement element = driver.findElement(Electronics_category_Button);
        hoverElement(driver, element);
        return this;

    }

    public P01_HomePage hoverOverApparel(){
        WebElement element = driver.findElement(Apparel_category_Button);
        hoverElement(driver, element);
        return this;
    }

    public P01_HomePage click_Apparel_category_Button() {
        driver.findElement(this.Apparel_category_Button).click();
        return this;
    }

    public P01_HomePage click_RandomdifferentCategories() {
        String xpathOfRandCategories = "(//a[text()='" + getRandom_differentCategories() + "'])[1]";
        System.out.println("getRandom_differentCategories()=" + getRandom_differentCategories());
        driver.findElement(By.xpath(xpathOfRandCategories)).click();
        return this;
    }

    public P01_HomePage click_Randomdifferent_SubCategory_From_computerCategory() {
        String xpathOfRand_computersItems = "(//a[text()='" + getRandom_ComputerItems() + "'])[1]";
        System.out.println("getRandom_ComputerItems()=" + getRandom_ComputerItems());
        driver.findElement(By.xpath(xpathOfRand_computersItems)).click();
        return this;
    }

    public P01_HomePage click_Randomdifferent_SubCategory_From_ElectronicsCategory() {
        String xpathOfRand_ElectronicsItems = "(//a[text()='" + getRandom_ElectronicsItems() + "'])[1]";
        System.out.println("getRandom_ElectronicsItems()=" + getRandom_ElectronicsItems());
        driver.findElement(By.xpath(xpathOfRand_ElectronicsItems)).click();
        return this;
    }

    public P01_HomePage click_Randomdifferent_SubCategory_From_ApparelCategory() {
        String xpathOfRand_Appareltems = "(//a[text()='" + getRandom_ApparelItems() + "'])[1]";
        System.out.println("getRandom_ApparelItems()=" + getRandom_ApparelItems());
        driver.findElement(By.xpath(xpathOfRand_Appareltems)).click();
        return this;
    }

    String hoverRandomFirstThreeCategories;

    public P01_HomePage selectHover_FirstThreeCategory() {
        hoverRandomFirstThreeCategories = getRandom_FirstThreeCategories();
        String xpathOfRandom_FirstThreeCategories_element = "(//a[text()='" + hoverRandomFirstThreeCategories + "'])[1]";
        System.out.println("getRandom_FirstThreeCategories()=" + hoverRandomFirstThreeCategories);

        WebElement element = driver.findElement(By.xpath(xpathOfRandom_FirstThreeCategories_element));
        hoverElement(driver, element);
        return this;
    }

    public P01_HomePage Select_WithHoverSubCategories() {
        if ("Computers ".equals(hoverRandomFirstThreeCategories)) {
            String xpathOfRandom_SubCategories = "(//a[text()='" + getRandom_ComputerItems() + "'])[1]";
            String hoverRandom_SUBCategories = getRandom_ComputerItems();
            System.out.println("getRandom_ComputerItems()=" + getRandom_ComputerItems());
            driver.findElement(By.xpath(xpathOfRandom_SubCategories)).click();
        } else if ("Electronics ".equals(hoverRandomFirstThreeCategories)) {
            String xpathOfRandom_SubCategories = "(//a[text()='" + getRandom_ElectronicsItems() + "'])[1]";
            String hoverRandom_SUBCategories = getRandom_ElectronicsItems();
            System.out.println("getRandom_ElectronicsItems()=" + getRandom_ElectronicsItems());
            driver.findElement(By.xpath(xpathOfRandom_SubCategories)).click();
        } else if ("Apparel ".equals(hoverRandomFirstThreeCategories)) {
            String xpathOfRandom_SubCategories = "(//a[text()='" + getRandom_ApparelItems() + "'])[1]";
            String hoverRandom_SUBCategories = getRandom_ApparelItems();
            System.out.println("getRandom_ApparelItems()=" + getRandom_ApparelItems());
            driver.findElement(By.xpath(xpathOfRandom_SubCategories)).click();
        }
        return this;
    }
}
