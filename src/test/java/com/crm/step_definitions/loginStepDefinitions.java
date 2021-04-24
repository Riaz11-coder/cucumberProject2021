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


//    @Given("User is on environment login page")
//    public void userIsOnEnvironmentLoginPage() {
//
//        driver.get(ConfigurationReader.getProperty("url"));
//
//    }
//
//    @Then("User should be able to see Authorization title")
//    public void userShouldBeAbleToSeeAuthorizationTitle() {
//
//        String actualTitle = lp.authorizationTitle.getText();
//        String expectedTitle = "Authorization";
//
//        System.out.println("Actual Title: "+actualTitle);
//        System.out.println("Exepcetd Title: "+expectedTitle);
//
//        System.out.println(actualTitle.equals(expectedTitle));
//        Assert.assertEquals(actualTitle,expectedTitle);
//    }
//


    @Given("User is on login page")
    public void userIsOnLoginPage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }


    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        lp.login(username,password);
    }

    @Then("User should be able to see Activity Stream page title")
    public void user_should_be_able_to_see_dashboard_page_title() {

        String actualTitle = lp.activityStream.getText();
        String expectedTitle = "Activity Stream";

        System.out.println("Actual Title: "+actualTitle);
        System.out.println("Expected Title: "+expectedTitle);

        System.out.println(actualTitle.equals(expectedTitle));
        Assert.assertEquals(actualTitle,expectedTitle);



    }



}
