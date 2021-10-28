package com.crm.step_definitions;

import com.crm.pages.contactUsPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class Contact_Us_Jira {


    contactUsPage cp = new contactUsPage();

    @Given("User enters url")
    public void user_enters_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url1"));
    }


    @When("User clicks the Contact Us button")
    public void user_clicks_the_contact_us_button() {
        BrowserUtils.waitFor(1);
        cp.contactUsButton.click();
    }
    @When("User selects a subject")
    public void user_selects_a_subject() {
        BrowserUtils.waitFor(1);
        Select select1 = new Select(cp.subjectHeadingDropDown);
        select1.selectByVisibleText("Customer service");
    }
    @When("User inputs a valid email address")
    public void user_inputs_a_valid_email_address() {
        BrowserUtils.waitFor(1);
        cp.emailInputBox.sendKeys("test@Gmail.com");
    }
    @When("User inputs an order number")
    public void user_inputs_an_order_number() {
        BrowserUtils.waitFor(1);
        cp.orderReferenceInputBox.sendKeys("12345");
    }
    @When("User inputs a message")
    public void user_inputs_a_message() {
        BrowserUtils.waitFor(1);
        cp.messageInputBox.sendKeys("This is an Automation Test");
    }
    @When("User clicks Send")
    public void user_clicks_send() {
        BrowserUtils.waitFor(1);
        cp.sendButton.click();
    }
    @Then("User should see a confirmation message")
    public void user_should_see_a_confirmation_message() {
        String actual =  cp.successMessage.getText();
        System.out.println("Actual message is: "+ actual);
        String expected = "Your message has been successfully sent to our team.";
        System.out.println("Expected message is: "+expected);
        Assert.assertTrue(cp.successMessage.isDisplayed());
        System.out.println(actual.equals(expected));
        Assert.assertEquals(actual,expected);

    }

    @When("User clicks the Contact Us")
    public void user_clicks_the_contact_us() {
        BrowserUtils.waitFor(1);
        cp.contactUsButton.click();
    }
    @When("User selects subject")
    public void user_selects_subject() {
        BrowserUtils.waitFor(1);
        Select select1 = new Select(cp.subjectHeadingDropDown);
        select1.selectByVisibleText("Customer service");
    }
    @When("User enters invalid Email address")
    public void user_enters_invalid_email_address() {
        BrowserUtils.waitFor(1);
        cp.emailInputBox.sendKeys("invalidEmail");
    }
    @And("User Sends form")
    public void userSendsForm() {
        BrowserUtils.waitFor(1);
        cp.sendButton.click();
    }
    @Then("User should see error message")
    public void user_should_see_error_message() {
        String actualError =  cp.errorMessage.getText();
        System.out.println("Actual error message is: "+ actualError);

        String expectedError = "Invalid email address.";
        System.out.println("Actual Error message contains: "+expectedError);

        Assert.assertTrue(actualError.contains(expectedError));
        Assert.assertTrue(cp.errorMessage.isDisplayed());

    }


}
