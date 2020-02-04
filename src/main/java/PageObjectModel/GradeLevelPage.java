package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;

import java.util.List;

public class GradeLevelPage extends AbstractClass{
    private WebDriver driver;

    public GradeLevelPage() {
//        this.inputgradelevelName = inputgradelevelName;
//        this.inputgradelevelcode = inputgradelevelcode;
//        this.inputgradelevelPriority = inputgradelevelPriority;
        driver = Driver.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement inputgradelevelName;

    @FindBy(xpath ="//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.CODE']//input")
    private WebElement inputgradelevelcode;

    @FindBy(xpath = "//ms-dialog-content//ms-text-field[@placeholder='GENERAL.FIELD.PRIORITY']//input]")
    private WebElement inputgradelevelPriority;

    @FindAll({
            @FindBy(xpath = "//div[@class='cdk-overlay-pane']/div/div")
    })
    private List<WebElement> nextGradeOptions;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='order']/input")
    private WebElement inputOrder;


    public void typeInTheInputgradelevelName(String name) {
        sendkeysFunction(inputgradelevelName, name);
    }

    public void typeIntheInputgradelevecode(String code) {
        sendkeysFunction(inputgradelevelcode , code);
    }

    public void inputgradelevelPriority(String priority){ sendkeysFunction(inputgradelevelPriority,priority);}




    }


    //



