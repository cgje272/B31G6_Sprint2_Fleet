package com.B31G6_Sprint2_Fleet.pages;
import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'Dashboards')]")
    public WebElement  dashboards;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[1]")
    public WebElement dashboard;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement manageDashboard;
    @FindBy (xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement  fleet;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[3]")
    public WebElement vehicles;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[4]")
    public WebElement vehicleOdometer;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[5]")
    public WebElement vehicleCosts;
    @FindBy (xpath = "//span[normalize-space()='Vehicle Contracts']")
    public WebElement vehicleContract;

    @FindBy(xpath = "//div[normalize-space()='You do not have permission to perform this action.']")
    public WebElement errorMsgDriver;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[7]")
    public WebElement fuelLogs;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[8]")
    public WebElement serviceLogs;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[9]")
    public WebElement model;
    @FindBy (xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'Customers')]")
    public WebElement  customers;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[10]")
    public WebElement  accounts;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[11]")
    public WebElement  contacts;
    @FindBy (xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'Sales')]")
    public WebElement  sales;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[12]")
    public WebElement  oportunities;
    @FindBy (xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'Activities')]")
    public WebElement  activities;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[13]")
    public WebElement  calls;
    @FindBy (xpath = "//a/span[contains(@class, 'title title-level-2') and contains(text(), 'Calendar Events')]/..")
    public WebElement  calendarEvents;
    @FindBy (xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'Marketing')]")
    public WebElement marketing;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[15]")
    public WebElement campaigns;
    @FindBy (xpath = "(//span[@class='title title-level-2'])[16]")
    public WebElement emailCampaigns;

    @FindBy (xpath="//a[@href ='http://www.oroinc.com/doc']")
    public WebElement oroinclLink;

    @FindBy (xpath = "//a[@href='/pinbar/help']")
    public WebElement pinbarLink;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    public WebElement loaderMask;

    @FindBy (xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'Reports & Segments')]")
    public WebElement reportsAndSegments;

    @FindBy ( xpath = "//span[contains(@class, 'title title-level-1') and contains(text(), 'System')]")
    public WebElement system;


    public void waitUntilLoaderScreenDisappear() {

        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
