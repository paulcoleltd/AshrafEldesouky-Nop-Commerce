package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

    // constructor
    // Locators
    // Action Methods
    WebDriver driver;

    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    // TODO step2: define locators
    private final By searchBox_btnUP = By.xpath("//input[@id='small-searchterms']");
    private final By SearchForItem_btnDown = By.xpath("(//button[@type='submit' and text()='Search'])[2]");

    private final By SearchButtonUp = By.xpath("(//button[@type='submit'])[1]");
    private final By SearchButtonDown = By.xpath("(//button[@type='submit'])[2]");

    public PageBase Insert_SearchItem_up(String Item) {
        driver.findElement(this.searchBox_btnUP).sendKeys(Item);
        return this;
    }
    public PageBase Insert_SearchItem_down(String Item) {
        driver.findElement(this.SearchForItem_btnDown).sendKeys(Item);
        return this;
    }

    public PageBase Click_SearchButtonUp() {
        driver.findElement(this.SearchButtonUp).click();
        return this;
    }
    public PageBase Click_SearchButtonDown() {
        driver.findElement(this.SearchButtonDown).click();
        return this;
    }
    public PageBase CLick_searchBox_UPFunction(String keyword) {
        driver.findElement(this.searchBox_btnUP).sendKeys(keyword, Keys.ENTER);
        return this;
    }
    public PageBase CLick_searchBox_DownFunction(String keyword) {
        driver.findElement(this.SearchForItem_btnDown).sendKeys(keyword, Keys.ENTER);
        return this;
    }
    public static void hoverElement(WebDriver driver,WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }


    public static void SCrollDown(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }
    public static void SCroll_deepTill_Down(WebDriver driver) {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
    public static void ThreadSleep2000() throws InterruptedException {
        Thread.sleep(1500);
    }
}
