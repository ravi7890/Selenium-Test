package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;


public class DuckGoScreens {

    WebDriver driver=new ChromeDriver();
    public DuckGoScreens(){

    }

    public void navigateToDuckGoApplication()  {
        try{
            driver.get("https://start.duckduckgo.com");
            Thread.sleep(3000);
        }
        catch (Exception e){
            Assert.fail("Failed to navigate to Duck Go Application");
        }

    }

    public void lookAtDuckGoApplication() {
        try{
            //take screenshot
        }
        catch (Exception e){
            Assert.fail("Failed to navigate to Duck Go Application");
        }

    }

    public void verifyDuckGoLogoinHomePage() {
        try{
            //take screenshot
        }
        catch (Exception e){
            Assert.fail("Failed to navigate to Duck Go Application");
        }
    }
}
