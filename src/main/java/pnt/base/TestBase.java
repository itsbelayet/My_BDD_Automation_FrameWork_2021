package pnt.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static void setupDriver() {
        //System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
        driver= new FirefoxDriver();
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
