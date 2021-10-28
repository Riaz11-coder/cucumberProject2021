package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InputFieldPage {

    public InputFieldPage(){ PageFactory.initElements(Driver.getDriver(),this); }


    @FindBy(css = "input[class='form-control']")
    public WebElement inputFieldBox;

    @FindBy(css = "button[class='btn btn-default']")
    public WebElement showMessageButton;

    @FindBy(css = "span[id='display']")
    public WebElement messageDisplay;

    @FindBy(css = "a[title = 'Close']")
    public WebElement popUpClose;


}
