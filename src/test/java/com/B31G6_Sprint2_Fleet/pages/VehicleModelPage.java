package com.B31G6_Sprint2_Fleet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class VehicleModelPage extends HomePage {


    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[2]")
    public WebElement modelName;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[3]")
    public WebElement make;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[4]")
    public WebElement canBeRequested;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[5]")
    public WebElement CVVI;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[6]")
    public WebElement CO2_Fee;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[7]")
    public WebElement cost;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[8]")
    public WebElement totalCost;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[9]")
    public WebElement CO2_emissions;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[10]")
    public WebElement fuelType;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']//tr[1]//th[11]")
    public WebElement vendors;

    @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
    public  WebElement errorMessage;

    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public List<WebElement> actualVehiclesModelColumns;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement vehiclesModelButton;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[7]")
    public WebElement vehiclesModelButtonForDriver;



    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleetIconForDriver;

}
