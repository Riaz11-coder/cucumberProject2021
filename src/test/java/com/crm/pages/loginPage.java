package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

    public loginPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[class='log-popup-header']")
    public WebElement authorizationTitle;

    @FindBy(xpath = "(//input[@class='login-inp'])[1]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@class='login-inp'])[2]")
    public WebElement passWord;

    @FindBy(css = "input[class='login-btn']")
    public WebElement login;

    @FindBy(id = "pagetitle")
    public WebElement activityStream;

    @FindBy(css = "span[id='user-name']")
    public WebElement userProfileTab;

    @FindBy(xpath = "//*[@id='popup-window-content-menu-popup-user-menu']/div/div/a[3]/span[2]")
    public WebElement logoutButton;

    public void login(String username, String password){

        userName.sendKeys(username);
        passWord.sendKeys(password);
        login.click();

    }
}
