package SampleTests;

import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ABTesting {
    @Test
    public void abTesting(){
        WebDriver Chrome;
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        Chrome=new ChromeDriver();
        Chrome.manage().window().maximize();
        try {
            Chrome.get("http://the-internet.herokuapp.com/");
            Thread.sleep(1000);
            //Chrome.findElement(By.xpath("//a[@href='/abtest']")).click();
            Chrome.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();
            Thread.sleep(1000);
            Chrome.close();
        }
        catch (Exception e){
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }

}
