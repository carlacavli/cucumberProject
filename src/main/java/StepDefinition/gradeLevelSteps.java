package StepDefinition;

import PageObjectModel.FeesPage;
import PageObjectModel.applicationPage;
import PageObjectModel.leftNav;
import PageObjectModel.signInPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utulities.Driver;

import java.util.concurrent.TimeUnit;

public class gradeLevelSteps {
    WebDriver driver;
    leftNav lv = new leftNav();
    signInPage sip = new signInPage();
    FeesPage fp = new FeesPage();
    applicationPage ap = new applicationPage();

    @Given("^Go to mersys website$")
    public void go_to_mersys_website() throws Throwable {
        driver = Driver.getDriver();
        driver.manage().window().fullscreen();
        driver.get("https://test-basqar.mersys.io");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Type the username and password and click on login button$")
    public void type_the_username_and_password_and_click_on_login_button() throws Throwable {
        sip.typeIninputUserName();
        sip.typeIninputPassword();
        sip.clickonbuttonLogin();
    }

    @Given("^click on Setup$")
    public void click_on_Setup() throws Throwable {
        lv.clickondropdownSetup();
    }

    @Given("^click on Parameters$")
    public void click_on_Parameters() throws Throwable {
        lv.clickondropdownParameters();
    }

    @Given("^click on Grade Levels$")
    public void click_on_Grade_Levels() throws Throwable {
        lv.clickOnGradeLevels();
    }


}