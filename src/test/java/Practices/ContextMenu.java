package Practices;

import com.sun.scenario.effect.impl.state.AccessHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ContextMenu {
    @Test
    public void contextMenuCheck(){
        try{
            WebDriver browser;
            System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
            browser=new ChromeDriver();
            browser.manage().window().maximize();
            browser.get("http://the-internet.herokuapp.com/");
            browser.findElement(By.xpath("//a[text()='Context Menu']")).click();
            Thread.sleep(3000);
            browser.findElement(By.xpath("//div[2]/div[@id='content']/div/div[@id='hot-spot']")).click();
            Thread.sleep(3000);
            browser.close();

        }
        catch (Exception e){
            System.out.println("Error  "+e.getMessage());
        }
    }
}
