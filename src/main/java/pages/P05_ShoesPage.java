package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P05_ShoesPage {
    // constructor
    // Locators
    // Action Methods

    // TODO: Step1: Constructor

    // TODO step2: define locators


    // TODO: Step1: Constructor
    WebDriver driver;

    public P05_ShoesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    private final By RedRadioButton = By.xpath("//input[@id='attribute-option-15']");
    public P05_ShoesPage Click_RedRadioButton(){
        driver.findElement(this.RedRadioButton).click();
        return this;
    }
}
