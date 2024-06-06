package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P06_Desktops {


    // TODO: Step1: Constructor
    WebDriver driver;

    public P06_Desktops(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // TODO step2: define locators
    private final By BuildOwnComputer = By.xpath("(//img[@title='Show details for Build your own computer'])");
    private final By DigitalStorm = By.xpath("//img[@title='Show details for Digital Storm VANQUISH 3 Custom Performance PC']");
    private final By LenovoIdeaCentre = By.xpath("//img[@title='Show details for Lenovo IdeaCentre 600 All-in-One PC']");
    private final By AddToCart_btn = By.xpath("//button[@id='add-to-cart-button-1']");
    public P06_Desktops Click_BuildOwnComputer(){
        driver.findElement(this.BuildOwnComputer).click();
        return this;
    }
    public P06_Desktops Click_DigitalStorm(){
        driver.findElement(this.DigitalStorm).click();
        return this;
    }
    public P06_Desktops Click_LenovoIdeaCentre(){
        driver.findElement(this.DigitalStorm).click();
        return this;
    }

}
