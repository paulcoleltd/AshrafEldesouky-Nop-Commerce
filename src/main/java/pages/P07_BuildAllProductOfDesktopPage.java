package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P07_BuildAllProductOfDesktopPage {

    WebDriver driver;

    public P07_BuildAllProductOfDesktopPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }


    private final By RamRadio_dropdown = By.xpath("//select[@id='product_attribute_2']");
    private final By AddToCart_btn = By.xpath("//button[@id='add-to-cart-button-1']");
    private final By HDD230GB = By.xpath("//label[text()='320 GB']");
    private final By AddToWatchListbtn_product2 = By.xpath("//button[@id='add-to-wishlist-button-2']");
    private final By AddToCompateListProduct3 = By.xpath("//button[text()='Add to compare list']");
    public P07_BuildAllProductOfDesktopPage Click_AddToCompateListProduct3btn(){
        driver.findElement(this.AddToCompateListProduct3).click();
        return this;
    }
    public P07_BuildAllProductOfDesktopPage Click_AddToWatchListProduct2btn(){
        driver.findElement(this.AddToWatchListbtn_product2).click();
        return this;
    }
    public P07_BuildAllProductOfDesktopPage Click_RamRadio_dropdown(){
        driver.findElement(this.RamRadio_dropdown).click();
        return this;
    }
    public P07_BuildAllProductOfDesktopPage Select_RamRadio(){
        Select dropdown = new Select(driver.findElement(this.RamRadio_dropdown));
        dropdown.selectByVisibleText("2 GB");
        return this;
    }
    public P07_BuildAllProductOfDesktopPage Click_AddToCart_btn() throws InterruptedException {
        PageBase.ThreadSleep2000();
        driver.findElement(this.AddToCart_btn).click();
        return this;
    }
    public P07_BuildAllProductOfDesktopPage Click_HDD230GB(){
        driver.findElement(this.HDD230GB).click();
        return this;
    }
    //////////



}
