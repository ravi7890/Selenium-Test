package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;



import org.testng.annotations.Test;
import utilities.DriverFactory;

import java.util.concurrent.TimeUnit;

public class SampleTest {

    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        try{
            System.out.println("Before Test");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
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
            driver.findElement(By.xpath("//*[@id=\"search_form_input_homepage\"]")).sendKeys("Hello");
            Thread.sleep(2000);
            driver.findElement(By.id("search_button_homepage")).click();
            Thread.sleep(2000);



        }catch(Exception e){
            System.out.println("Exception->"+e.getMessage());
        }

    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
        driver.close();
    }

}
