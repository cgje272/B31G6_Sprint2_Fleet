package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.AccountsPage;
import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v114.fedcm.model.Account;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class US12_StepDefs extends HomePage {
    AccountsPage page=new AccountsPage();
    @When("user clicks on Customers")
    public void user_clicks_on_customers() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(2);
        customers.click();
    }


    @When("user clicks on Accounts")
    public void user_clicks_on_accounts() {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(2);
        accounts.click();
    }
    @When("user clicks on the filter button")
    public void user_clicks_on_the_filter_button() {

       waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(2);
       page.filtersBtn.click();

    }
    @Then("user should see {string} filter options")
    public void user_should_see_filter_options(String string) {
        waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(2);

        List<String> expected =Arrays.stream(expected.split(",")).collect(Collectors.toList());
                String expectedFilters="Account Name, Contact Name, Contact,Email, Contact Phone, Owner, Business Unit, Created At";
        List<String> actualFiltersList= actualFiltersList.stream().map(k ->k.trim().substring(0,k.indexOf(":"))).collect(Collectors.toList());
                Assert.assertEquals(actualFiltersList,expectedFilters);

    }
}
