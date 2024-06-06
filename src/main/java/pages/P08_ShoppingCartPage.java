package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static pages.PageBase.SCroll_deepTill_Down;

public class P08_ShoppingCartPage {
    // constructor
    // Locators
    // Action Methods

    // TODO: Step1: Constructor
    WebDriver driver;

    public P08_ShoppingCartPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // TODO step2: define locators
    private final By ShoppingCart_btn = By.xpath("//span[text()='Shopping cart']");
    private final By Continueshoppingbtn = By.xpath("//button[text()='Continue shopping']");

    private final By Checkout = By.xpath("//button[@id='checkout']");
    private final By TermsAndCondition = By.xpath("//input[@id='termsofservice']");

    public P08_ShoppingCartPage Click_ShoppingCart_btn() {
        driver.findElement(this.ShoppingCart_btn).click();
        SCroll_deepTill_Down(driver);
        return this;
    }

    public P08_ShoppingCartPage Click_Continueshoppingbtn() {
        driver.findElement(this.Continueshoppingbtn).click();
        return this;
    }

    public P08_ShoppingCartPage Click_Checkoutbtn() {
        driver.findElement(this.Checkout).click();
        return this;
    }

    public P08_ShoppingCartPage Click_TermsAndConditiontn() {
        driver.findElement(this.TermsAndCondition).click();
        return this;
    }
}
