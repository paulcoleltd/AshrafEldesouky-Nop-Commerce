package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class P04_ForgetPasswordPage {

    // constructor
    // Locators
    // Action Methods

    // TODO: Step1: Constructor
    WebDriver driver;

    public P04_ForgetPasswordPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    private final By emailRecovery = By.xpath("//input[@id='Email']");
    private final By RecoveryEmail_btn = By.xpath("//button[@name='send-email']");

    public P04_ForgetPasswordPage Insert_forgetPassword(String recevingEmail){
        driver.findElement(this.emailRecovery).sendKeys(recevingEmail);
        return this;
    }
    public P04_ForgetPasswordPage Click_RecoveryEmail_btn(){
        driver.findElement(this.RecoveryEmail_btn).click();
        return this;
    }

}
