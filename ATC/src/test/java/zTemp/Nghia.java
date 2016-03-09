package zTemp;

import Pages.HomePage;
import Utilities.SetDriver;
import com.beust.jcommander.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by nghiatrongtran on 3/9/2016.
 */
public class Nghia {

    private WebDriver driver;

    @BeforeTest
    public void preCondition(){
        SetDriver driverSetup = new SetDriver();
        driver = (FirefoxDriver) driverSetup.setupFirefoxDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.navigate().refresh();
    }

    @AfterTest
    public void posCondition(){
        try {
            if (driver != null)
                driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 1, description = "User can search a car from Home Page")
    public void findYourCarFromHomePage() {

        //Navigate to Autotrader Site
        driver.get("http://test3.autotrader.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //Find Your Car on Home Page
        HomePage hp = new HomePage(driver);
        hp.findYourCarOnHomePage("AUDI", "A3", "Under $5,000", "30342");
    }
}
