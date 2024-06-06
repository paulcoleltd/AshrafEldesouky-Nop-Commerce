package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static pages.PageBase.SCroll_deepTill_Down;

public class P09_CheckOutPage {

    // constructor
    // Locators
    // Action Methods
    WebDriver driver;

    public P09_CheckOutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // TODO step2: define locators
    private final By Country_dropList = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    private final By StateProvince_List = By.xpath("//select[@id='BillingNewAddress_StateProvinceId']");
    private final By City_txtField = By.xpath("//input[@id='BillingNewAddress_City']");
    private final By Address1_txtField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    private final By ZipPostalCode_txtField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    private final By PhoneNumber_txtField = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    private final By Continue_btn = By.xpath("(//button[@name='save'])[1]");
    private final By ContinueSecond_btn = By.xpath("(//button[text()='Continue'])[3]");
    private final By ContinueThird_btn = By.xpath("(//button[text()='Continue'])[4]");
    private final By ContinueFourth_btn = By.xpath("(//button[text()='Continue'])[5]");
    private final By Confirm_btn = By.xpath("(//button[text()='Confirm'])");
    private final By ContinueFifth_btn = By.xpath("//button[text()='Continue']");
    // TODO: Step1: Constructor

public P09_CheckOutPage Click_Confirm_btn() {
    driver.findElement(this.Confirm_btn).click();
    return this;
}
    public P09_CheckOutPage Click_ContinueFifth_btn() throws InterruptedException {
        PageBase.ThreadSleep2000();
        driver.findElement(this.ContinueFifth_btn).click();
        return this;
    }
    public P09_CheckOutPage Click_ContinueFourth_btn() {
        driver.findElement(this.ContinueFourth_btn).click();
        SCroll_deepTill_Down(driver);
        return this;
    }
    public P09_CheckOutPage Click_ContinueThird_btn() {
        driver.findElement(this.ContinueThird_btn).click();
        return this;
    }
    public P09_CheckOutPage Click_Continue_btn() {
        driver.findElement(this.Continue_btn).click();
        return this;
    }
    public P09_CheckOutPage ContinueSecond_btn() {
        driver.findElement(this.ContinueSecond_btn).click();
        return this;
    }
    public P09_CheckOutPage Insert_PhoneNumber() {
        driver.findElement(this.PhoneNumber_txtField).sendKeys("+201099857450");
        return this;
    }
    public P09_CheckOutPage Insert_ZipPostalCode() {
        driver.findElement(this.ZipPostalCode_txtField).sendKeys("101101");
        return this;
    }
    public P09_CheckOutPage Click_Country_dropList() {
        driver.findElement(this.Country_dropList).click();
        return this;
    }
    public P09_CheckOutPage Insert_City_txtField() {
        driver.findElement(this.City_txtField).sendKeys("suth");
        return this;
    }
    public P09_CheckOutPage Insert_Address1_txtField() {
        driver.findElement(this.Address1_txtField).sendKeys("suth");
        return this;
    }
    public P09_CheckOutPage Select_Country_dropList() {
        Select select = new Select(driver.findElement(this.Country_dropList));
        select.selectByVisibleText("United States");
        return this;
    }

    public P09_CheckOutPage Click_StateProvince_DropList() {
        driver.findElement(this.Country_dropList).click();
        return this;
    }

    public P09_CheckOutPage Select_StateProvince_DropList() {
        Select select = new Select(driver.findElement(this.StateProvince_List));
        select.selectByVisibleText("Alabama");
        return this;
    }
}
