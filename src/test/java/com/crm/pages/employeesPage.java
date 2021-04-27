package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class employeesPage {

    public employeesPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "bx_left_menu_menu_company")
    public WebElement employeesButton;

    @FindBy(css = "a[class='structure-boss-name']")
    public WebElement asiyaSomethingSomething;

    @FindBy(css = "span[class='webform-small-button-text']")
    public WebElement sendMessageButton;

    @FindBy(css = "textarea[class = 'bx-messenger-textarea-input']")
    public WebElement textBox;

    @FindBy(css = "a[class='bx-im-fullscreen-popup-back-link']")
    public WebElement closeButton;

    @FindBy(css = "span[class='bx-messenger-message']")
    public WebElement message;

    @FindBy(xpath = "//*[@id='bx-desktop-tab-content-im']/div/div[3]/div[6]/div[3]/div/div")
    public WebElement messageText;


}
