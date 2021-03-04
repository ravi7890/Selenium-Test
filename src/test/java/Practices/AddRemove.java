package Practices;

import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class AddRemove {
    @FindBy (xpath="//a[contains(text(),'Add/Remove Elements')]" )
    WebElement AddButton;
    @Test
    public void Addremovcheck(){
        try {
            WebDriver browser;
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
            browser = new ChromeDriver();
            browser.manage().deleteAllCookies();
            browser.manage().window().maximize();
            browser.get("http://the-internet.herokuapp.com/");
            Thread.sleep(3000);
            //browser.findElement(By.xpath("//a[@href='/add_remove_elements/']")).click();
            //browser.findElement(By.partialLinkText("Add/Remove Elements")).click();
            //browser.findElement(By.xpath("//a[text()='Add/Remove Elements']")).click();
            //browser.findElement(By.xpath("//a[contains(text(),'Add/Remove Elements')]")).click();

            Thread.sleep(3000);
            for(int i=0;i<=3;i++) {
                browser.findElement(By.xpath("//div/div[@class='example']/button[text()='Add Element']")).click();
            }
            Thread.sleep(3000);
            for(int i=0;i<=3;i++){
                browser.findElement(By.xpath("//div/div/div/div/button[text()='Delete'][1]")).click();
            }
            /**
             * driver.switchTo().alert().sendKeys("Text");
             * driver.switchTo().alert().accept();
             * driver.switchTo().alert().dismiss();
             */

            Thread.sleep(3000);
            browser.close();
        }
        catch (Exception e){
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
