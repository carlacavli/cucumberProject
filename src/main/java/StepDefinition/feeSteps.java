package StepDefinition;
import PageObjectModel.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
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
    public void click_on_parameters() throws Throwable {
        lv.clickondropdownParameters();
    }

    @Given("^Click on fee$")
    public void click_on_fee() throws Throwable {
        lv.clickOnFees();
    }


    @Given("^Type the feename \"(.*?)\"$")
    public void type_the_feename(String feename) throws Throwable {
        fp.typeInFeeName(feename);
    }

    @Given("^Type the feecode \"(.*?)\"$")
    public void type_the_feecode(String feecode) throws Throwable {
        fp.typeInFeeCode(feecode);
    }

    @Given("^Type in Feepriority \"(.*?)\"$")
    public void type_in_Feepriority(String feepriority) throws Throwable {
        fp.typeInFeePriority(feepriority);
    }


    @Then("^Remove the data \"(.*?)\"$")
    public void remove_the_data(String arg1) throws Throwable {

    }

    @Then("^Verify data is removed \"(.*?)\"$")
    public void verify_data_is_removed(String arg1) throws Throwable {

    }


}