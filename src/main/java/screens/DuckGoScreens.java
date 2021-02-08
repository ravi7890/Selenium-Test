package screens;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.Assertion;
import utilities.DriverFactory;


public class DuckGoScreens extends DriverFactory {

    WebDriver driver;

    @FindBy(xpath="//*[@id=\"logo_homepage_link\"]")
    WebElement Logo;

    @FindBy(xpath="//*[@id=\"search_form_input_homepage\"]")
    WebElement SearchBox;

    @FindBy(id="search_button_homepage")
    WebElement SearchButton;

    public DuckGoScreens(){
        super();
        driver= DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
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

    public void verifyDuckGoLogoinHomePage() {
        try{
            if( Logo.isDisplayed()){
                System.out.println("Logo is available");
            }else{
                Assert.fail("Logo is not available");
            }
        }
        catch (Exception e){
            Assert.fail("Failed to verify Duck Go Logo in HomePage");
        }
    }

    public void searchItem(String itemName) {
        try{
            SearchBox.sendKeys(itemName);
            SearchButton.click();

        }
        catch (Exception e){
            Assert.fail("Failed search Item Duck Go Application");
        }
    }
}
