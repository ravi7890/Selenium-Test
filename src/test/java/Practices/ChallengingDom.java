package Practices;

import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChallengingDom {
    @Test
    public void challengingDomCheck(){

        try {
            WebDriver chrome;
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();
            chrome.get("http://the-internet.herokuapp.com/");
            chrome.findElement(By.xpath("//div[2]/div[@id='content']/ul/li[5]/a")).click();
            Thread.sleep(3000);
            chrome.findElement(By.xpath("//div[2]/div/div/div/div/div/a[1]")).click();
            Thread.sleep(3000);
            chrome.findElement(By.xpath("//div[2]/div/div/div/div/div/a[2]")).click();
            Thread.sleep(3000);
            chrome.findElement(By.xpath("//div[2]/div/div/div/div/div/a[3]")).click();
            Thread.sleep(3000);
            chrome.close();
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Error   "+e.getLocalizedMessage());
        }
    }
}
