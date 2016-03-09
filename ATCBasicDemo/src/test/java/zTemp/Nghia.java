package zTemp;

import ATC.Pages.HomePage;
import ATC.Utilities.SetEnvironment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by nghiatrongtran on 3/8/2016.
 */
public class Nghia {

    WebDriver driver;
    SetEnvironment testEnvironment = new SetEnvironment(driver);

    @Test
    public void VerifyUserCanNavigateToATC() {
        driver = new FirefoxDriver();
        driver.navigate().to(testEnvironment.getUrl());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        HomePage hp = new HomePage(driver);
        //driver.findElement(hp.btnContinueToAutotrader).click();
        hp.FindYourCarOnHomePage("AUDI", "A3", "Under $5,000", "30342");

        //driver.quit();
    }
}
