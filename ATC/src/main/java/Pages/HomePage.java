package Pages;

import Utilities.Utilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by nghiatrongtran on 3/9/2016.
 */
public class HomePage {

    //Set Variables
    private WebDriver driver;

    //Constructor
    public HomePage(WebDriver driver){this.driver = driver;}

    //Detect WebElements
    public By btnContinueToAutotrader = By.cssSelector("[data-birf-cmp='loc_sbmt_btn']");
    By ddlMake = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-homepageMake-selectOneMenu");
    By ddlModel = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-homepageModel-selectOneMenu");
    By ddlPrice = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-homepagePrice-selectOneMenu");
    By txtZip = By.cssSelector("#fyc-form-j_id_1_b7-j_id_1_bj-j_id_1_cl-zipcode");
    By btnSearch = By.cssSelector("[data-qaid='btn-srch-hp']");

    /**
     * Created by nghiatrongtran on 3/10/2016.
     * Description: This action is used to Find a car on Home Page with Make, Model, Price, Zipcode
     **/
    public void findYourCarOnHomePage(String strMake, String strModel, String strPrice, String strZip){
        Utilities utilitiesElement = new Utilities(driver);
        utilitiesElement.SelectDropDownListItem(ddlMake, strMake);
        utilitiesElement.Sleep(5000);
        utilitiesElement.SelectDropDownListItem(ddlPrice, strPrice);
        utilitiesElement.Sleep(5000);
        utilitiesElement.SelectDropDownListItem(ddlModel, strModel);
        driver.findElement(txtZip).sendKeys(strZip);
        driver.findElement(btnSearch).click();
    }
}
