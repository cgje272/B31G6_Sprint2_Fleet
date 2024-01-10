package com.B31G6_Sprint2_Fleet.pages;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage {

    public CreateCalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

@FindBy (xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckBox;

    @FindBy(xpath = "//span[.='day(s)']/preceding-sibling::input[1]")
    public WebElement daysInputBox;

    @FindBy(xpath = "//span[.='This value should not be blank.']")
    public WebElement thisValueShouldNotBeBlank_ErrorMessage;
}
