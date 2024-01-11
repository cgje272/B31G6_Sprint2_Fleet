package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.interactions.Actions;

public class VehiclesPageStepDefinitions extends HomePage {

    Actions actions = new Actions(Driver.getDriver());

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
    }

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/");

    }
    @When("user selects Vehicles page")
    public void user_selects_vehicles_page() {
        actions.moveToElement(this.fleet).click().perform();
        actions.moveToElement(this.vehicles).click().perform();
        BrowserUtils.sleep(5);

    }

    @Then("user can see all checkboxes as unchecked")
    public void user_can_see_all_checkboxes_as_unchecked() {

    }

}
