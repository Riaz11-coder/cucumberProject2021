package com.crm.step_definitions;

import com.crm.pages.calendarPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class calendarStepDefinitions {

    calendarPage cp = new calendarPage();

    @When("User selects Calendar tab")
    public void user_selects_calendar_tab() {
        BrowserUtils.waitFor(2);
      cp.calendarButton.click();
    }
    @And("User clicks the Add button")
    public void user_clicks_the_add_button() {
        BrowserUtils.waitFor(2);
        cp.addButton.click();
    }
    @And("User selects a name for the event")
    public void user_selects_a_name_for_the_event() {
        BrowserUtils.waitFor(2);
        cp.addEventName("Cybertek Payment Due Date");
    }
    @And("User selects an event date and time")
    public void user_selects_an_event_date_and_time() {
        BrowserUtils.waitFor(1);
        cp.dateFrom.click();
        BrowserUtils.waitFor(1);
        cp.calendarYear.click();
        BrowserUtils.waitFor(1);
        cp.y2022.click();
        BrowserUtils.waitFor(1);
        cp.calendarMonth.click();
        BrowserUtils.waitFor(1);
        cp.april.click();
        BrowserUtils.waitFor(1);
        cp.april20.click();
        BrowserUtils.waitFor(1);
        cp.timeFrom.click();
        BrowserUtils.waitFor(1);
        cp.hour.sendKeys(Keys.BACK_SPACE);
        BrowserUtils.waitFor(1);
        cp.hour.sendKeys("4");
        BrowserUtils.waitFor(1);
        cp.minutes.sendKeys(Keys.BACK_SPACE,Keys.BACK_SPACE);
        BrowserUtils.waitFor(1);
        cp.minutes.sendKeys("20");
        BrowserUtils.waitFor(1);
        cp.timeTo.click();
        BrowserUtils.waitFor(1);
        Select selectOne = new Select(cp.repeatDropDown);

        selectOne.selectByVisibleText("Yearly");
        BrowserUtils.waitFor(1);
        cp.locationDropDown.click();
        BrowserUtils.waitFor(1);









      /*  List<WebElement> eventDates = cp.calendarDayLayout.findElements(By.tagName("a"));

        for (WebElement each:eventDates) {

            System.out.println(each.getText());

        }

       */

    }
}
