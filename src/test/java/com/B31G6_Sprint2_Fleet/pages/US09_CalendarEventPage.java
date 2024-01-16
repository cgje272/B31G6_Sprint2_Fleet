package com.B31G6_Sprint2_Fleet.pages;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US09_CalendarEventPage {

    public US09_CalendarEventPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



   @FindBy(xpath ="//a[@class='btn main-group btn-primary pull-right ']")
    public WebElement createCalendarEvents;

   @FindBy(xpath = "//input[contains(@id,'recurrence-repeat-view')]")
    public WebElement repeatCheckBox;

   @FindBy(xpath ="//span[.='day(s)']/preceding-sibling::input[1]")
    public WebElement dayBox;

   @FindBy(xpath = "//span[@class='validation-failed']")
    public WebElement errorMessage1;

    @FindBy(xpath =" (//div[@class='recurrence-subview-control__item'])[1]/label/input[3]/../../span")
    public WebElement errorMessage2;
}