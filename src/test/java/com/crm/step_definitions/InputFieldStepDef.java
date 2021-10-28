package com.crm.step_definitions;

import com.crm.pages.InputFieldPage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class InputFieldStepDef {

InputFieldPage ifp = new InputFieldPage();

    @Given("User is on landing page")
    public void user_is_on_landing_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url_2"));
        BrowserUtils.waitFor(15);
        ifp.popUpClose.click();
        BrowserUtils.waitFor(2);
    }

    @When("User inputs message into input field")
    public void user_inputs_message_into_input_field() {
       ifp.inputFieldBox.sendKeys("JYESSSS!");
    }

    @When("User clicks Show Message button")
    public void user_clicks_show_message_button() {
       ifp.showMessageButton.click();
    }

    @Then("User message is displayed")
    public void user_message_is_displayed() {
       ifp.messageDisplay.getText();

       String message = "JYESSSS!";
       System.out.println("Message displayed is: "+message);

       ifp.messageDisplay.isDisplayed();

        System.out.println("Actual equals Expected: " + ifp.messageDisplay.getText().equals(message));

        Assert.assertTrue(ifp.messageDisplay.isDisplayed());

        Assert.assertEquals(ifp.messageDisplay.getText(),message);
    }
}
