package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US04_StepDefs extends HomePage {

    @When("user is on the vehicle contracts page")
    public void user_is_on_the_vehicle_contracts_page() {
        BrowserUtils.sleep(10);
        fleet.click();
        vehicleContract.click();
    }

    @Then("user should see {string} in the title")
    public void user_should_see_in_the_title(String expectedInTitle) {
        BrowserUtils.sleep(10);
        BrowserUtils.verifyTitle(expectedInTitle);

    }

    @Then("user should see {string} in the URL")
    public void user_should_see_in_the_url(String expectedInURL) {
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectedInUrl = "Extend_Entity_VehicleContract";
        Assert.assertTrue(actualURL.contains(expectedInUrl));
    }

    @When("user clicks on the vehicle contracts page")
    public void userClicksOnTheVehicleContractsPage() {
        BrowserUtils.sleep(10);
        fleet.click();
        vehicleContract.click();
    }

    @Then("user should see “You do not have permission to perform this action.”")
    public void userShouldSeeYouDoNotHavePermissionToPerformThisAction() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(this.errorMsgDriver));
    }


}
