package com.B31G6_Sprint2_Fleet.pages;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_VehiclesPage {

     public US07_VehiclesPage(){
         PageFactory.initElements(Driver.getDriver(), this);

     }

     @FindBy( xpath = "(//table//th//input[@type='checkbox'])[1]")
     public WebElement checkbox;

     @FindBy(xpath = "//div/table/tbody/tr[5]/td[1]/input")
    public WebElement vehicle5;


}
