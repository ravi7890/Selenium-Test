package screens;

import cucumber.api.java.an.E;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class AmazonReusable {

    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElement SignButton;
    @FindBy(id="ap_email")
    WebElement Userid;

    @FindBy(id="ap_password")
    WebElement Passwrd;

    @FindBy(id="signInSubmit")
    WebElement SignInbutton;

    @FindBy(id="continue")
    WebElement ContinueButton;

    static String Url="https://www.amazon.in/";

    @FindBy(id="twotabsearchtextbox")
    WebElement Searchbox;

    @FindBy(id="nav-search-submit-button")
    WebElement SubmitButton;

    @FindBy(xpath = "//span[contains(text(),\"Lay's Potato Chips India's Magic Masala, 130 g\")]")
    WebElement LaysItem;



   public AmazonReusable(WebDriver driver){
       PageFactory.initElements(driver,this);
    }



    public void loginToAmazon(WebDriver driver,String userName,String password){
        try{
            //Sign actions
           // driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
            SignButton.click();
            Userid.sendKeys(userName);
            ContinueButton.click();
            Passwrd.sendKeys(password);
            Userid.click();
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("Error"+e);
            Assert.fail("Exception occurred-->"+e.getLocalizedMessage());
        }
    }

    public void navigateToAmazon(WebDriver driver,String url){
        try{
            driver.get(Url);
            driver.manage().window().maximize();
            Thread.sleep(3000);

        }catch(Exception e){

            System.out.println("Error"+e);
            Assert.fail("Exception occurred-->"+e.getLocalizedMessage());
        }
    }
    public void searchItem(WebDriver driver,String item) {
        try{
            Searchbox.sendKeys(item);
            SubmitButton.click();
            LaysItem.click();
            Thread.sleep(3000);
        }
        catch(Exception e){
            System.out.println("Error"+e);
            Assert.fail("Exception occurred-->"+e.getLocalizedMessage());
        }
    }

    public void selectQuantity(WebDriver driver, String quantity){
        try{
            // Select QuantityDropDown=new Select(driver.findElement(By.xpath("//*[@id=\"quantity\"]")));
            Select QuantityDropDown=new Select(driver.findElement(By.id("quantity")));
            QuantityDropDown.selectByValue(quantity);
        }
        catch(Exception e){
            System.out.println("Failed in selecting Quantity:"+e);
            Assert.fail("Exception occurred-->"+e.getLocalizedMessage());
        }

    }

    public void addToCart(WebDriver driver){
        try{
            driver.findElement(By.xpath("//a[@href='https://www.amazon.in/gp/cart/view.html?ref_=nav_cart']")).click();
            }
        catch (Exception e){
            System.out.println("Error"+e);
            Assert.fail("Exception occurred-->"+e.getLocalizedMessage());
        }
    }


    public void paymentProcess(WebDriver driver){
        try{
            driver.findElement(By.id("hlb-ptc-btn-native")).click();
            driver.findElement(By.id("a-autoid-1-announce")).click();
            driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();//relative path example
            System.out.println("Exit chrome");

        } catch (Exception e){
            System.out.println("Error"+e);
            Assert.fail("Exception occurred-->"+e.getLocalizedMessage());
        }
    }

    public void logOut(WebDriver driver){

        //

    }

}
