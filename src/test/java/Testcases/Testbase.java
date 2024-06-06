package Testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class Testbase {

    protected static WebDriver driver;

    @BeforeTest
    public void setup() {
        // Step 1: Define WebDriver
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Step 2: Configure driver
        driver.manage().window().maximize();
        // Set the implicit wait time to 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.nopcommerce.com/");
    }

    @AfterTest
    public void teardown(){
        if (driver != null) {
            driver.quit();
        }
    }
}
