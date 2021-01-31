package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SampleTest{

    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        try{
            System.out.println("Before Test");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            driver =new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }catch(Exception e){
            System.out.println("Exception->"+e.getMessage());
        }
    }
    @Test
    public void sampleTest(){
        try{
            System.out.println("Inside of Test");
            driver.get("https://start.duckduckgo.com/");
            Thread.sleep(3000);
        }catch(Exception e){
            System.out.println("Exception->"+e.getMessage());
        }
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

}
