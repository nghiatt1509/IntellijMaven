package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by nghiatrongtran on 3/10/2016.
 */
public class Utilities {

    private WebDriver driver;

    //Constructor
    public Utilities(WebDriver driver) {this.driver = driver;}

    public void Sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void SelectDropDownListItem(By webElementName, String strValue){

        try {
            WebElement dropdownList = driver.findElement(webElementName);
            dropdownList.sendKeys(strValue);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
