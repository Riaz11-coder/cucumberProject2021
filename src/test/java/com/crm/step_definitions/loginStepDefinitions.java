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




//    @Given("user is on enviroment login page")
//    public void user_is_on_enviroment_login_page() {
//        driver = Driver.getDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get(ConfigurationReader.getProperty("url"));
//    }



//    @Then("user should see Authorization title")
//    public void user_should_see_authorization_title() {
//        String actualTitle = lp.authorizationTitle.getText();
//        String expectedTitle = "Authorization";
//        System.out.println("Actual title: " + actualTitle);
//        System.out.println("Expected title " + expectedTitle);
//        System.out.println(expectedTitle.equals(actualTitle));
//        Assert.assertEquals(expectedTitle,actualTitle);
//    }

    @Given("User is on login page")
    public void userIsOnLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("User {string} and {string}")
    public void user_and(String username, String password) {
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
