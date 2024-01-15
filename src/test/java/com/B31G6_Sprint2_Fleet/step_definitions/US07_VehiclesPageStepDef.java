package com.B31G6_Sprint2_Fleet.step_definitions;


import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.pages.LoginPage;
import com.B31G6_Sprint2_Fleet.pages.US07_VehiclesPage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import com.B31G6_Sprint2_Fleet.utilities.ConfigurationReader;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class US07_VehiclesPageStepDef extends HomePage {

    US07_VehiclesPage vehiclesPage = new US07_VehiclesPage();


    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        Driver.getDriver().get("https://qa.xfleetsolutions.com/user/login");
    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("driver")){
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }else if(userType.equalsIgnoreCase("sales manager")){
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }else if(userType.equalsIgnoreCase("store manager")){
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    Actions actions = new Actions(Driver.getDriver());

    @When("the user navigates to {string} to {string}")
    public void the_user_navigates_to_to(String string, String string2) {
        BrowserUtils.sleep(5);
        actions.moveToElement(this.fleet).perform();
        actions.moveToElement(this.vehicles).click().perform();
        BrowserUtils.sleep(5);
    }

    @When("the user select the all cars")
    public void the_user_select_the_all_cars() {
        BrowserUtils.waitFor(5);
        vehiclesPage.checkbox.click();

    }

    @When("the user select any car {int}")
    public void the_user_select_any_car(Integer int1) {
        BrowserUtils.waitFor(5);
        vehiclesPage.


    }

    @Then("the user should be able to see all the checkboxes as {string}")
    public void the_user_should_be_able_to_see_all_the_checkboxes_as(String string) {

    }


    @Then("the user should be able to see car as {string}")
    public void the_user_should_be_able_to_see_car_as(String string) {

    }
}



