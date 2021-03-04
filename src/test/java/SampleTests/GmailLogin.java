package SampleTests;

import cucumber.api.java.an.E;
import cucumber.api.java.nl.Stel;
import cucumber.api.java8.Ca;
import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailLogin {
    @Test
    public void gmail(){
        WebDriver chrom;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Cucumber-Selenium-Java\\src\\main\\resources\\chromedriver.exe");
        chrom= new ChromeDriver();
        try {
            chrom.get("https://www.google.com/");
            chrom.manage().window().maximize();
            Thread.sleep(3000);
            chrom.findElement(By.xpath("//input[@name='q']")).sendKeys("Gmail");
            Thread.sleep(3000);
            chrom.findElement(By.xpath("//input[@class='gNO89b']")).click();
            Thread.sleep(3000);
            chrom.findElement(By.xpath("//a[@href='https://www.google.com/intl/en_in/gmail/about/']")).click();
            chrom.findElement(By.xpath("//body/div[2]/div[1]/div[4]/ul[1]/li[3]/a[1]")).click();

            chrom.switchTo().defaultContent();
            try{
                chrom.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Ravi");
            }
            catch (Exception e){
                System.out.println("Error        "+e.getLocalizedMessage());
            }

            //*[@id="firstName"] /html/body/div[1]/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div[1]
            // /div/form/span/section/div/div/div[1]/div[1]/div[1]/div/div[1]/div/div[1]/input
            chrom.findElement(By.id("lastName")).sendKeys("Chandra");
            chrom.findElement(By.id("username")).sendKeys("Ravi Chandra");
            chrom.close();
        }
        catch (Exception e){
            System.out.println("Error        "+e.getLocalizedMessage());
        }
    }

}
