package com.B31G6_Sprint2_Fleet.pages;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarEventsPage {

    public CalendarEventsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEvent;


}
