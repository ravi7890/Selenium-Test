package Practices;

import cucumber.api.java.tr.Ama;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import screens.AmazonReusable;


public class ReusableMethod {
    @Test
    public void reusable() {
        WebDriver browser;
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        browser= new ChromeDriver();
        DropDown obj=new DropDown();
        obj.Dropdowncheck(browser,"http://the-internet.herokuapp.com/");
    }
}
