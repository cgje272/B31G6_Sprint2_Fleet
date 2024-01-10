package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.CalendarEventsPage;
import com.B31G6_Sprint2_Fleet.pages.CreateCalendarEventPage;
import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US08_StepDefs extends HomePage {
    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage;
    CalendarEventsPage calendarEventsPage = new CalendarEventsPage();
    CreateCalendarEventPage createCalendarEventPage = new CreateCalendarEventPage();

    @When("user hovers over Activities")
    public void user_hovers_over_activities() {
        actions.moveToElement(homePage.activities).perform();
    }

    @When("clicks Calendar Events")
    public void clicks_calendar_events() {
        homePage.calendarEvents.click();
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
        String expectedResult=""+int1;
        String actualResult= createCalendarEventPage.daysInputBox.getText();

        Assert.assertEquals(expectedResult,actualResult);
    }
}
