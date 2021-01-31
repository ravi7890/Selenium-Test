package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DuckGoElements {

    WebDriver driver=new ChromeDriver();
    public DuckGoElements(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id="logoID")
    WebElement Logo;

    @FindBy(id="logoID")
    WebElement Log1;

    @FindBy(id="logoID")
    WebElement Log3;


}
