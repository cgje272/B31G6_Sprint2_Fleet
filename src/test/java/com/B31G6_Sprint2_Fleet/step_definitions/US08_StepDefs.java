package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.CalendarEventsPage;
import com.B31G6_Sprint2_Fleet.pages.CreateCalendarEventPage;
import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class US08_StepDefs extends HomePage {
    Actions actions = new Actions(Driver.getDriver());
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();


    @When("user hovers over Activities")
    public void user_hovers_over_activities() {
        actions.moveToElement(this.activities).perform();
    }

    @When("clicks Calendar Events")
    public void clicks_calendar_events() {
        actions.moveToElement(this.calendarEvents).click().perform();
        BrowserUtils.sleep(5);
    }

    @When("clicks Create Calendar Event")
    public void clicks_create_calendar_event() {
        calendarEventsPage.createCalendarEvent.click();
    }

    @When("checks the Repeat checkbox")
    public void checks_the_repeat_checkbox() {
        createCalendarEventPage.repeatCheckBox.click();
    }

    @Then("user should see number {int} displayed by default in the Days space")
    public void user_should_see_number_displayed_by_default_in_the_days_space(Integer int1) {
        String expectedResult = "" + int1;
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        String actualResult = (String) jsExecutor.executeScript("return arguments[0].value;", createCalendarEventPage.daysInputBox);
//input box does not get updated with changes, therefore
        //using JavaScriptExecutor is the only way to get that text
        Assert.assertEquals(expectedResult, actualResult);
    }

    @And("user clears the Days space")
    public void userClearsTheDaysSpace() {
        createCalendarEventPage.daysInputBox.clear();
    }


    @Then("user should see “This value should not be blank.” error message")
    public void userShouldSeeThisValueShouldNotBeBlankErrorMessage() {
        Assert.assertTrue(createCalendarEventPage.thisValueShouldNotBeBlank_ErrorMessage.isDisplayed());

    }
}
