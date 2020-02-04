package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;


public class FeesPage extends AbstractClass {

    private WebDriver driver;

    public FeesPage() {

        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']/input")
    private WebElement inputFeeName;

    @FindBy(xpath = "")
    private WebElement inputFeeCode;

    @FindBy
    private WebElement inputIntegrationCode;

    @FindBy
    private WebElement inputFeePriority;


    public void typeInFeeName(String name) {
        sendkeysFunction(inputFeeName, "School Fee");
    }

    public void typeInFeeCode(String code) {
        sendkeysFunction(inputFeeCode, "");
    }

    public void typeInIntegrationCode() {
        sendkeysFunction(inputIntegrationCode, "");
    }

    public void typeInFeePriority(String priority) {
        sendkeysFunction(inputFeePriority, "");
    }


}

