package StepDefinition;
import PageObjectModel.*;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utulities.Driver;
import utulities.ReadProperties;


import java.util.concurrent.TimeUnit;

public class feeSteps extends AbstractClass {
    WebDriver driver;
    signInPage sip = new signInPage();
    leftNav lv = new leftNav();
    applicationPage ap = new applicationPage();
    FeesPage fp = new FeesPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {

        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get(ReadProperties.getData("URL"));
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickonbuttonLogin();
    }

    @Given("^Click on setup on top$")
    public void click_on_setup_on_top() throws Throwable {
        lv.clickondropdownSetup();
    }

    @Given("^Click on parameters$")
    public void click_on_parameter() throws Throwable {
        lv.clickondropdownParameters();
    }

    @Given("^Click on fee$")
    public void click_on_fee() throws Throwable {
        lv.clickOnFees();

    }

    @Given("^Type the  feename \"(.*?)\"$")
    public void type_the_feename(String name) throws Throwable {
        fp.typeInFeeName(name);
    }

    @Given("^Type the  feecode \"(.*?)\"$")
    public void type_the_feecode(String code) throws Throwable {
        fp.typeInFeeCode(code);
    }

    @Given("^Type in Feepriority \"(.*?)\"$")
    public void type_in_Feepriority(String priority) throws Throwable {
        fp.typeInFeePriority(priority);
    }
}