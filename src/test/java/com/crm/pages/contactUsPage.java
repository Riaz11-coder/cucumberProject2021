package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class contactUsPage {

    public contactUsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[title = 'Contact Us']")
    public WebElement contactUsButton;

    @FindBy(css = "select[id = 'id_contact']")
    public WebElement subjectHeadingDropDown;

    @FindBy(css = "input[id = 'email']")
    public WebElement emailInputBox;

    @FindBy(css = "input[id = 'id_order']")
    public WebElement orderReferenceInputBox;

    @FindBy(css = "textarea[id = 'message']")
    public WebElement messageInputBox;

    @FindBy(css = "button[id = 'submitMessage']")
    public WebElement sendButton;

    @FindBy(css = "p[class = 'alert alert-success']")
    public WebElement successMessage;

    @FindBy(css = "div[class = 'alert alert-danger']")
    public WebElement errorMessage;

}
