package Practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CheckBox {

    @Test
    public  void   checkBoxcheck(){
        WebDriver chrom;
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        chrom=new ChromeDriver();
        try {
            chrom.manage().deleteAllCookies();
            chrom.get("http://the-internet.herokuapp.com/");
            chrom.findElement(By.xpath("//div[2]/div[@id='content']/ul/li/a[@href='/checkboxes']")).click();
            chrom.findElement(By.xpath("//div[2]/div/div[@class='example']/form[@id='checkboxes']/input[1]")).click();
            Thread.sleep(3000);
            chrom.close();

        }
        catch (Exception e){

        }
    }

}
