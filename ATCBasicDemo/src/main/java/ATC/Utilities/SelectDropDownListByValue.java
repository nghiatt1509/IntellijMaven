package ATC.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

/**
 * Created by nghiatrongtran on 3/7/2016.
 */
public class SelectDropDownListByValue {

    WebDriver driver;

    public SelectDropDownListByValue(WebDriver driver){

        this.driver = driver;
        SetEnvironment evn = new SetEnvironment(driver);
    }

    public void SelectDropDownListItem(By webElementName, String strValue){

        try {
            WebElement dropdownList = driver.findElement(webElementName);
            dropdownList.sendKeys(strValue);
//            Select selectItem = new Select(driver.findElement(webElementName));
//            selectItem.selectByValue(strValue);
        }catch (Exception ex) {

            ex.printStackTrace();
        }
    }
}
