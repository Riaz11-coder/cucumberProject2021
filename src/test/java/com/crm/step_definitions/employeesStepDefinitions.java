package com.crm.step_definitions;

import com.crm.pages.employeesPage;
import com.crm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class employeesStepDefinitions {

    employeesPage emp = new employeesPage();

    @When("User clicks on Employees button")
    public void user_clicks_on_employees_button() {
        BrowserUtils.waitForClickablility(emp.employeesButton,10);
        emp.employeesButton.click();
    }
    @When("User clicks on Employee profile")
    public void user_clicks_on_employee_profile() {
       BrowserUtils.waitForVisibility(emp.asiyaSomethingSomething,10);
       emp.asiyaSomethingSomething.click();
    }
    @When("User clicks on Send message button")
    public void user_clicks_on_send_message_button() {
       BrowserUtils.waitForVisibility(emp.sendMessageButton,10);
       emp.sendMessageButton.click();
    }
    @When("User enters message in the Text box")
    public void user_enters_message_in_the_text_box() {
        BrowserUtils.waitFor(2);
        emp.textBox.sendKeys("Hello, this is a Test", Keys.ENTER);
    }
    @Then("User should see message in the chat")
    public void user_should_see_message_in_the_chat() {


        String actual = emp.messageText.getText();
        System.out.println("Actual = "+actual);
        String expected = "Hello, this is a Test";
        System.out.println("Expected = "+expected);
        Assert.assertTrue(actual.contains(expected));
    }

}
