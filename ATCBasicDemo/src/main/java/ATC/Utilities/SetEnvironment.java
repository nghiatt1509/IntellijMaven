package ATC.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


/**
 * Created by nghiatrongtran on 3/7/2016.
 */
public class SetEnvironment {

    WebDriver driver;
    Properties prop = null;

    public SetEnvironment(WebDriver webDriver) {

        this.driver = webDriver;
        prop = new Properties();

        try {
            prop.load(new FileInputStream("src/main/resources/config"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Get Url from config file
    public String getUrl(){
        return prop.getProperty("test3Url");
    }
}
