package com.crm.step_definitions;

import com.crm.pages.loginPage;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logoutStepDefinitions {

    loginPage lp = new loginPage();

    @Given("User is on the login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User enters {string} & {string}")
    public void user_enters_and(String username, String password) {
        username = ConfigurationReader.getProperty("helpDeskUsername5");
        password = ConfigurationReader.getProperty("password");
        lp.login(username,password);
    }
    @Then("User should see Activity Stream page title")
    public void user_should_be_able_to_see_dashboard_page_title() {
        String actualTitle = lp.activityStream.getText();
        String expectedTitle = "Activity Stream";

        System.out.println("Actual Title: "+actualTitle);
        System.out.println("Expected Title: "+expectedTitle);

        System.out.println(actualTitle.equals(expectedTitle));
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("User clicks on username profile")
    public void userClicksOnUsernameProfile() {
        lp.userProfileTab.click();
    }


    @And("User selects log out button")
    public void userSelectsLogOutButton() {
        lp.logoutButton.click();
    }

    @Then("User should see Authorization title")
    public void userShouldSeeAuthorizationTitle() {

        String actualTitle = lp.authorizationTitle.getText();
        String expectedTitle = "Authorization";
        System.out.println("Actual title: " + actualTitle);
        System.out.println("Expected title: " + expectedTitle);
        System.out.println(expectedTitle.equals(actualTitle));
        Assert.assertEquals(expectedTitle,actualTitle);
    }

}
