package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.pages.LoginPage;
import com.B31G6_Sprint2_Fleet.utilities.ConfigurationReader;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class OroincDocumentationPage_StepDefinitions {
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();

    @Given("user is on the XFLEET login page")
    public void user_is_on_the_xfleet_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("fleeturl"));
    }

    @When("user login with below credentials {string},{string}")
    public void user_login_with_below_credentials(String string, String string2) {
    loginPage.login(string,string2);

    }
    @When("user clicks on the question mark icon")
    public void user_clicks_on_the_question_mark_icon() {
        homePage.oroinclLink.click();

    }


    @Then("new page url should be https:\\/\\/doc.oroinc.com\\/")
    public void newPageUrlShouldBeHttpsDocOroincCom() {
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
            }
        String expectedURL="https://doc.oroinc.com/";
        String actualURL=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedURL,actualURL);


    }
}







