package screens;

import org.testng.Assert;
import org.testng.asserts.Assertion;
import utilities.DriverFactory;


public class DuckGoScreens extends DriverFactory {

    public DuckGoScreens(){
        super();
    }

    public void navigateToDuckGoApplication()  {
        try{
            DriverFactory.getDriver().get("https://start.duckduckgo.com");
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
