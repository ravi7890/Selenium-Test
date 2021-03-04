package Practices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

class browserCheck{
    WebDriver chrome;
   public browserCheck(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        chrome= new ChromeDriver();
        System.out.println("Inside Constructor");
        chrome.get("https://abodeqa.com/finding-child-elements-in-webdriver-using-findelements/");
    }
}

  public class ConstructorEx  {
    @Test
    public void google(){
        try {
            browserCheck obj = new browserCheck();
        }
        catch (Exception e){
            System.out.println("Error   "+e.getMessage());
        }
    }
}