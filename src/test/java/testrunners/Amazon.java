package testrunners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.plaf.basic.BasicButtonUI;
import java.util.concurrent.TimeUnit;


public class Amazon {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\eclipse-workspace\\Cucumber-Selenium-Java\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("Inside chrome");
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
        driver.findElement(By.id("ap_email")).sendKeys("videlaravichandra@gmail.com");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Forgery8$");
        driver.findElement(By.id("signInSubmit")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lays");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("//span[contains(text(),\"Lay's Potato Chips India's Magic Masala, 130 g\")]")).click();
        driver.findElement(By.cssSelector("#add-to-cart-button")).click();
        driver.findElement(By.id("hlb-ptc-btn-native")).click();
        driver.findElement(By.id("a-autoid-1-announce")).click();
        driver.findElement(By.id("ap_password")).sendKeys("Forgery8$");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();//relative path example
        System.out.println("Exit chrome");

        //driver.close();
    }

}
