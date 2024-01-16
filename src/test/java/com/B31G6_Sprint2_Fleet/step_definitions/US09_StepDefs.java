package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.pages.CalendarEventsPage;
import com.B31G6_Sprint2_Fleet.pages.CreateCalendarEventPage;
import com.B31G6_Sprint2_Fleet.pages.HomePage;
import com.B31G6_Sprint2_Fleet.pages.US09_CalendarEventPage;
import com.B31G6_Sprint2_Fleet.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class US09_StepDefs extends HomePage {
    US09_CalendarEventPage page=new US09_CalendarEventPage();

//
//    @When("user clicks Activities")
//    public void userClicksActivities() {
//        activities.click();
//
//    }
////
////    @Then("clicks Calendar Events")
////    public void clicksCalendarEvents() {
////
////        calendarEvents.click();
////    }
////
//
//@Then("clicks Create the Calendar Event")
//public void clicksCreateTheCalendarEvent() {
//    BrowserUtils.sleep(5);
//      page.createCalendarEvents.click();
//}
//
//    @Then("Checks the Repeat checkbox")
//    public void checksTheRepeatCheckbox() {
//
//        page.repeatCheckBox.click();
//        BrowserUtils.sleep(5);
//    }

    @When("user enter less than one in Repeat Every days box")
    public void userEnterLessThanOneInRepeatEveryDaysBox() {
        page.dayBox.clear();
        page.dayBox.sendKeys("0");
        BrowserUtils.sleep(3);
    }

    @Then("users should see {string}")
    public void usersShouldSee(String errorMessage) {
        String expected=errorMessage;
        String actual=page.errorMessage1.getText();

        Assert.assertEquals(expected,actual);
    }

    @When("user  enter more than ninety-nine")
    public void userEnterMoreThanNinetyNine() {
     page.dayBox.clear();
     page.dayBox.sendKeys("999");
     BrowserUtils.sleep(3);
    }


    @Then("users should see The value have not to be more than {string}.")
    public void usersShouldSeeTheValueHaveNotToBeMoreThan(String expectedErrorMessage) {
    String actualErrorMessage = page.errorMessage2.getText();
   Assert.assertEquals(expectedErrorMessage,actualErrorMessage);

    }


}






