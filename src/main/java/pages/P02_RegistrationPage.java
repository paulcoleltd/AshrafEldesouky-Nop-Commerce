package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static util.Utility.*;

public class P02_RegistrationPage {
    // constructor
    // Locators
    // Action Methods

    WebDriver driver;
    public P02_RegistrationPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    private final By gender = By.xpath("//input[@id='gender-male']");
    private final By firstName = By.xpath("//input[@id='FirstName']");
    private final By lastNAme = By.xpath("//input[@id='LastName']");
    private final By email = By.xpath("//input[@type='email']");
    private final By companyName = By.xpath("//input[@id='Company']");
    private final By password = By.xpath("//input[@id='Password']");
    private final By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    private final By registerButton = By.xpath("//button[@id='register-button']");
    private final By ContinueToRegister = By.xpath("//a[text()='Continue']");
    private final By DateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    private final By DateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    private final By DateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    private final By RegisterSuccessfullyText = By.xpath("//div[@class='topic-block-title']");

    public P02_RegistrationPage Select_DateOfBirthDay() {
        //Initialize Select class with the dropdown web element
        Select DaydropdownList = new Select(driver.findElement(this.DateOfBirthDay));
        DaydropdownList.selectByVisibleText(String.valueOf(getRandomNumberBetween1and30()));
        return this;
    }
    public P02_RegistrationPage Select_DateOfBirthMonth() {
        Select MonthdropdownList = new Select(driver.findElement(this.DateOfBirthMonth));
        MonthdropdownList.selectByVisibleText(getRandomMonths());
        return this;
    }
    public P02_RegistrationPage Select_DateOfBirthYear() {
        //Initialize Select class with the dropdown web element
        Select YeardropdownList = new Select(driver.findElement(this.DateOfBirthYear));
        YeardropdownList.selectByVisibleText(String.valueOf(getRandomYearBetween1914And2024()));
        return this;
    }
    public P02_RegistrationPage registerNewUser(String firstName, String lastName, String email, String CompanyName, String password) throws InterruptedException {
        driver.findElement(this.gender).click();
        driver.findElement(this.firstName).sendKeys(firstName);
        driver.findElement(this.lastNAme).sendKeys(lastName);

        Select_DateOfBirthDay();
        Select_DateOfBirthMonth();
        Select_DateOfBirthYear();

        driver.findElement(this.email).sendKeys(email);
        driver.findElement(this.companyName).sendKeys(CompanyName);
        driver.findElement(this.password).sendKeys(password);
        driver.findElement(this.confirmPassword).sendKeys(password);
        driver.findElement(this.registerButton).click();
        Thread.sleep(1500);
        driver.findElement(this.ContinueToRegister).click();

        return this;
    }
    public boolean VerifyRegisterSucessfully() throws InterruptedException {
        return driver.findElement(this.RegisterSuccessfullyText).getText().contains("Welcome to our store");
    }
}
