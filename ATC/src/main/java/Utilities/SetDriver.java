package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by nghiatrongtran on 3/10/2016.
 */
public class SetDriver {

    private WebDriver driver;

    public WebDriver setupFirefoxDriver() {

        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
