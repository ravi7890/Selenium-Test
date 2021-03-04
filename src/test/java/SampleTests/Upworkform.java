package SampleTests;

import cucumber.api.java8.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;


public class Upworkform {

    @Test
    public void testSignUp() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
       /*/* try {
           driver.get("https://www.upwork.com/services/social-media-marketing/profile-setup-integration?vt_cmp=11508903722&vt_adg=110963613303&vt_src=google&vt_kw=create%20facebook%20accounts&vt_device=c&utm_source=google&utm_campaign=11508903722&utm_medium=paidsearch&gclid=CjwKCAiA1eKBBhBZEiwAX3gql1GHzrwnqcrZVD5dPhX1P0VvzFcBlVpMsIRksERQQwPGUPpvokVvnxoC05MQAvD_BwE");
            driver.manage().window().maximize();
            driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
            driver.findElement(By.id("input-email")).sendKeys("abcvernin@gmail.com");
            driver.findElement(By.id("first-name-input")).sendKeys("Ravi");
            driver.findElement(By.id("last-name-input")).sendKeys("Ch");
            driver.findElement(By.id("password-input")).sendKeys("Forgery8$");
            driver.findElement(By.id("country-dropdown")).click();
            String country="";
            int index=0;
            switch (country){
                case "Albania":
                    index=1;
                    break;

                case "Algeria":
                    index=2;
                    break;

            }
            System.out.println("Hello - Value of index-->"+index);
            String countrySelectionXpath="//*[@id=\"dropdown-menu-3\"]/li["+index+"]/span/span";
            driver.findElement(By.xpath(countrySelectionXpath)).click();

            ////*[@id="dropdown-menu-3"]/li[2]/span/span
            ////*[@id="dropdown-menu-3"]/li[3]/span/span
            Thread.sleep(3000);
            driver.close(); ////*[@id="dropdown-label-2"]/div/span
        }
        catch (Exception e){
            System.out.println("error  "+ e.getLocalizedMessage());
        }*/
        try {
            driver.get("http://the-internet.herokuapp.com/dropdown");
            Thread.sleep(3000);
            Select OptionsSelectDropDown=new Select(driver.findElement(By.id("dropdown")));
            OptionsSelectDropDown.selectByVisibleText("Option 1");
            Thread.sleep(3000);


        }
        catch (Exception e) {
            System.out.println("error          dfdjfkds"+e.getLocalizedMessage());
        }
    }
}
