package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.pages.LoginPage;
import com.B31G6_Sprint2_Fleet.pages.VehicleModelPage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class US05_StepDefs extends HomePage {

    LoginPage loginPage = new LoginPage();
    Actions actions = new Actions(Driver.getDriver());
    VehicleModelPage vehicleModelPage = new VehicleModelPage();



    @When("the user navigates to the Vehicles Model page")
    public void the_user_navigates_to_the_vehicles_model_page() {
        BrowserUtils.sleep(10);
        actions.moveToElement(this.fleet).perform();
        actions.moveToElement(vehicleModelPage.vehiclesModelButton).click().perform();
        BrowserUtils.sleep(10);
    }

    @Then("the page should display exactly below columns with the following names:")
    public void the_page_should_display_exactly_columns_with_the_following_names(List<String> expectedColumns) {
        BrowserUtils.sleep(10);
        List<String> actualVehiclesModelColumns = BrowserUtils.getElementsText(vehicleModelPage.actualVehiclesModelColumns);
        System.out.println("actualVehiclesModelColumns = " + actualVehiclesModelColumns);
        System.out.println("expectedColumns = " + expectedColumns);

        actualVehiclesModelColumns.removeIf(k->k.isBlank());
        Set<String> strings = new LinkedHashSet<>(actualVehiclesModelColumns);
        Assert.assertEquals(expectedColumns, new LinkedList<>(strings));

    }

    @Then("the system should display the message {string}")
    public void the_system_should_display_the_message(String string) {
        BrowserUtils.sleep(10);
        Assert.assertTrue(vehicleModelPage.errorMessage.isDisplayed());
    }



    @When("the user navigates to Vehicles Model page")
    public void theUserNavigatesToVehiclesModelPage() {
        BrowserUtils.sleep(10);
        actions.moveToElement(vehicleModelPage.fleetIconForDriver).perform();
        BrowserUtils.sleep(10);
        actions.moveToElement(vehicleModelPage.vehiclesModelButtonForDriver).click().perform();
        BrowserUtils.sleep(5);
    }
}
