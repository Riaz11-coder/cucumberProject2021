package com.crm.step_definitions;

import com.crm.pages.loginPage;

import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class loginStepDefinitions {

    loginPage lp = new loginPage();



    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) {
        lp.login(username,password);
    }


    @Then("User should be able to see Activity Stream page title")
    public void userShouldBeAbleToSeeActivityStreamPageTitle() {
        String actualTitle = lp.activityStream.getText();
        String expectedTitle = "Activity Stream";
        System.out.println("Actual title: " + actualTitle);
        System.out.println("Expected title: " + expectedTitle);
        System.out.println(actualTitle.equals(expectedTitle));
        Assert.assertTrue(lp.activityStream.isDisplayed());
    }



}
