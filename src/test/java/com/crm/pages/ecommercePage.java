package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ecommercePage {

    public ecommercePage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "input[id='search_query_top']")
    public WebElement searchBar;

    @FindBy(css = "ul[class = 'product_list grid row']")
    public WebElement productList;

    @FindBy(css = "button[type = 'submit']")
    public WebElement submitButton;
}
