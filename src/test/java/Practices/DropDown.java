package Practices;

import com.sun.scenario.effect.impl.state.AccessHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {
    public void Dropdowncheck(WebDriver driver,String link){
        try {
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.get(link);
            driver.findElement(By.xpath("//a[text()='Dropdown'])")).click();
            //rahul
        }
        catch (Exception e){
            System.out.println("Error"+e.getLocalizedMessage());
        }
    }
}
