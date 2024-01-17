package com.B31G6_Sprint2_Fleet.pages;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountsPage {
    public AccountsPage() {
            PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//div[@class='filter-item oro-drop']/div[1]")
    public List<WebElement> filters;
    @FindBy (xpath = "//a[@class='action btn mode-icon-only']")
    public WebElement filtersBtn;


}
