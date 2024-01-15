package com.B31G6_Sprint2_Fleet.pages;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US07_VehiclesPage {

     public US07_VehiclesPage(){
         PageFactory.initElements(Driver.getDriver(), this);

     }

     @FindBy(xpath = "//*[@id=\"grid-custom-entity-grid-1425551294\"]/div[2]/div[2]/div[2]/div/table/thead/tr/th[1]/div/button/input")
     public WebElement checkbox;

     @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement fleetUS07;

     @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement vehiclesUS07;

}
