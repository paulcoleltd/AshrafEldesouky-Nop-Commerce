package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P03_LoginPage {
    // constructor
    // Locators
    // Action Methods

    // TODO: Step1: Constructor
    WebDriver driver;

    public P03_LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    private final By EMAIL_TEXT = By.xpath("//input[@id='Email']");
    private final By PASSWORD_TEXT = By.xpath("//input[@id='Password']");
    private final By LOGIN_BUTTON = By.xpath("//button[text()='Log in']");
    private final By Forgotpassword_btn = By.xpath("//a[text()='Forgot password?']");
    private final By RememberMe_RadioButton = By.xpath("//input[@id='RememberMe']");
    private final By LoginSuccessText = By.xpath("//a[@class='ico-logout']");


    // TODO: step3 define action methods
    public P03_LoginPage Click_RememberMe() {
        driver.findElement(this.RememberMe_RadioButton).click();
        return this;
    }
    public P03_LoginPage inputEmail(String email){
        driver.findElement(this.EMAIL_TEXT).sendKeys(email);
        return this;
    }
    public P03_LoginPage inputPassword(String password){
        driver.findElement(this.PASSWORD_TEXT).sendKeys(password);
        return this;
    }
    public P03_LoginPage clickLoginButton(){
        driver.findElement(this.LOGIN_BUTTON).click();
        return this;
    }

    public P03_LoginPage Click_forgetPassword() {
        driver.findElement(this.Forgotpassword_btn).click();
        return this;
    }
    public boolean VerifyloginSucessfully() throws InterruptedException {
        return driver.findElement(this.LoginSuccessText).getText().contains("Log out");
    }
//a[@class='ico-logout']
}
