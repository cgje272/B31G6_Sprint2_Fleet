package com.B31G6_Sprint2_Fleet.pages;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement  dashboards;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[1]")
    public WebElement dashboard;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement manageDashboard;
    @FindBy (xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement  fleet;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement vehicles;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[4]")
    public WebElement vehicleOdometer;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[5]")
    public WebElement vehicleCosts;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[6]")
    public WebElement vehicleContract;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[7]")
    public WebElement fuelLogs;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[8]")
    public WebElement serviceLogs;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement model;
    @FindBy (xpath = "(//span[@class='title title-level-1'])[3]")
    public WebElement  customers;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[10]")
    public WebElement  accounts;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[11]")
    public WebElement  contacts;
    @FindBy (xpath = "(//span[@class='title title-level-1'])[4]")
    public WebElement  sales;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[12]")
    public WebElement  oportunities;
    @FindBy (xpath = "(//span[@class='title title-level-1'])[5]")
    public WebElement  activities;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[13]")
    public WebElement  calls;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[14]")
    public WebElement  calendarEvents;
    @FindBy (xpath = "(//span[@class='title title-level-1'])[6]")
    public WebElement marketing;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[15]")
    public WebElement campaigns;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[16]")
    public WebElement emailCampaigns;

    @FindBy (xpath="//a[@href ='http://www.oroinc.com/doc']")
    public WebElement oroinclLink;

    @FindBy (xpath = "//a[@href='/pinbar/help']")
    public WebElement pinbarLink;

}
