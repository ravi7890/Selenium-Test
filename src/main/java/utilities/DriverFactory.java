package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    static WebDriver driver;
    public DriverFactory(){
        setDriver();
    }

    public static void setDriver(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

   public static WebDriver getDriver(){
        return driver;
    }


}
