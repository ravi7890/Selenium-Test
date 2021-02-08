import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.DriverFactory;

public class SampleTest extends DriverFactory{

    @BeforeTest
    public void beforeTest(){
        try{
            System.out.println("Before Test");
            DriverFactory.getDriver();
        }catch(Exception e){
            System.out.println("Exception->"+e.getMessage());
        }
    }
    @Test
    public void sampleTest(){
        try{
            System.out.println("Inside of Test");
            DriverFactory.getDriver().get("https://start.duckduckgo.com/");
            Thread.sleep(3000);


        }catch(Exception e){
            System.out.println("Exception->"+e.getMessage());
        }
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

}
