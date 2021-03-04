package SampleTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import screens.AmazonReusable;

import java.util.concurrent.TimeUnit;

public class PlaceOrderTest {

    /** DIff types of Xpath
     * Absolute path-->starts from root node(/)
     * Relative path-->//
     */
    /**
     * Relative Xpath construction
     * "//input[@id='signInSubmit']"
     * "//a[@href='linkName']
     * "//span[@id='Id value']"
     * Continue button->//input[@id='continue']
     */
    WebDriver browser;
    AmazonReusable amazonReusable;
    @BeforeTest
    public void beforeTest(){
        try{
            System.out.println("Before Test");
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            browser =new ChromeDriver();
            browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            amazonReusable=new AmazonReusable(browser);
        }catch(Exception e){
            System.out.println("Exception->"+e.getMessage());
        }
    }

    @Test
    public void sampleTest(){
        try{
            System.out.println("Inside of Test");
            amazonReusable.navigateToAmazon(browser,"https://www.amazon.in/");
            amazonReusable.loginToAmazon(browser,"videlaravichandra@gmail.com","Forgery8$");
            amazonReusable.searchItem(browser,"lays");
            amazonReusable. selectQuantity(browser,"3");
            amazonReusable.addToCart(browser);
            amazonReusable.paymentProcess(browser);
            amazonReusable.logOut(browser);

            /**
             * login -
             * search->
             * input text field_>.sendkeys
             * check box, button>.click
             * drop select
             */

        }catch(Exception e){
            System.out.println("Exception->"+e.getLocalizedMessage());
        }

    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
        browser.close();
    }
}
