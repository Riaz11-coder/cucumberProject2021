package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import sun.jvm.hotspot.debugger.Page;

public class calendarPage {

    public calendarPage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "bx_left_menu_menu_calendar")
    public WebElement calendarButton;

    @FindBy(css = "button[class = 'ui-btn-main']")
    public WebElement addButton;

    //calendar popout
    @FindBy(css = "input[placeholder = 'Event name']")
    public WebElement eventNameField;

    @FindBy(css = "input[name = 'date_from']")
    public WebElement dateFrom;

    @FindBy(css = "input[name = 'date_to']")
    public WebElement dateTo;

    @FindBy(css = "a[class = 'bx-calendar-top-month']")
    public WebElement calendarMonth;

    @FindBy(css = "a[class = 'bx-calendar-top-year']")
    public WebElement calendarYear;

    @FindBy(css = "div[class='bx-calendar-layer']")
    public WebElement calendarDayLayout;

    @FindBy(css = "span[data-bx-month = '0']")
    public WebElement january;

    @FindBy(css = "span[data-bx-month = '1']")
    public WebElement february;

    @FindBy(css = "span[data-bx-month = '2']")
    public WebElement march;

    @FindBy(css = "span[data-bx-month = '3']")
    public WebElement april;
    @FindBy(css = "span[data-bx-month = '4']")
    public WebElement may;

    @FindBy(css = "span[data-bx-month = '5']")
    public WebElement june;

    @FindBy(css = "span[data-bx-month = '6']")
    public WebElement july;

    @FindBy(css = "span[data-bx-month = '7']")
    public WebElement august;

    @FindBy(css = "span[data-bx-month = '8']")
    public WebElement september;

    @FindBy(css = "span[data-bx-month = '9']")
    public WebElement october;

    @FindBy(css = "span[data-bx-month = '10']")
    public WebElement november;

    @FindBy(css = "span[data-bx-month = '11']")
    public WebElement december;

    @FindBy(css = "span[data-bx-year = '2021']")
    public WebElement y2021;

    @FindBy(css = "span[data-bx-year = '2022']")
    public WebElement y2022;

    @FindBy(css = "span[data-bx-year = '2023']")
    public WebElement y2023;

    @FindBy(css = "span[data-bx-year = '2024']")
    public WebElement y2024;

    @FindBy(css = "input[name = 'time_from']")
    public WebElement timeFrom;

    @FindBy(css = "input[name = 'time_to']")
    public WebElement timeTo;

    @FindBy(id = "calendar_slider_774975_rrule_type")
    public WebElement repeatDropDown;

    @FindBy(id = "calendar_slider_774975_location_wrap")
    public WebElement locationDropDown;

    @FindBy(id = "EC750688326-slider-destination-link")
    public WebElement addAttendees;

    @FindBy(id = "calendar_slider_774975_more_wrap")
    public WebElement notificationCheckBox;

    @FindBy(id = "calendar_slider_774975_save_cmd")
    public WebElement saveButton;
    //method to add event name (works)
    public void addEventName(String eventName) {
        eventNameField.sendKeys(eventName);
    }

    @FindBy(css = "div[class='bx-calendar-cell-block']")
    public WebElement calendarBlock;

    @FindBy(css = "input[id='calendar_slider_323539_date_from']")
    public WebElement calendarBlockTwo;


}
