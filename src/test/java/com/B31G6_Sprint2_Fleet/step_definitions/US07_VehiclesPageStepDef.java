package com.B31G6_Sprint2_Fleet.step_definitions;


import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class US07_VehiclesPageStepDef extends HomePage {


    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
    }

    @When("the user logged in as {string}")
    public void theUserLoggedInAs(String arg0) {


    }


    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String string, String string2) {
        fleet.click();
        vehicles.click();

    }

    @When("the user select the all cars")
    public void the_user_select_the_all_cars() {





    }

    @When("the user select any car {int}")
    public void the_user_select_any_car(Integer int1) {


    }

    @Then("the user should be able to see all the checkboxes as {string}")
    public void the_user_should_be_able_to_see_all_the_checkboxes_as(String string) {

    }


    @Then("the user should be able to see car as {string}")
    public void the_user_should_be_able_to_see_car_as(String string) {

    }
}



