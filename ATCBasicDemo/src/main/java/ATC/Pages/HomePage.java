package ATC.Pages;

import ATC.Utilities.SelectDropDownListByValue;
import ATC.Utilities.SetEnvironment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by nghiatrongtran on 3/7/2016.
 */
public class HomePage {

    WebDriver driver;
    WebDriverWait wait;
    WebElement webElement;

    public HomePage(WebDriver driver){

        this.driver = driver;
        SetEnvironment evn = new SetEnvironment(driver);
        wait = new WebDriverWait(driver, 20);
    }

    public By btnContinueToAutotrader = By.cssSelector("[data-birf-cmp='loc_sbmt_btn']");
    By lnkLogin = By.cssSelector("#j_id_1_4c");
    By ddlMake = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-homepageMake-selectOneMenu");
    By ddlModel = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-homepageModel-selectOneMenu");
    By ddlPrice = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-homepagePrice-selectOneMenu");
    By txtZip = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-j_id_1_cl-zipcode");
    By btnSearch = By.cssSelector("[data-qaid='btn-srch-hp']");

    public void FindYourCarOnHomePage(String strMake, String strModel, String strPrice, String strZip) {

        SelectDropDownListByValue selectCarInformation = new SelectDropDownListByValue(driver);
        selectCarInformation.SelectDropDownListItem(ddlMake, strMake);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ddlPrice));
        selectCarInformation.SelectDropDownListItem(ddlPrice, strPrice);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webElement = wait.until(ExpectedConditions.visibilityOfElementLocated(ddlModel));
        selectCarInformation.SelectDropDownListItem(ddlModel, strModel);

        driver.findElement(txtZip).sendKeys(strZip);
        driver.findElement(btnSearch).click();

        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

}
