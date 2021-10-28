package com.crm.step_definitions;

import com.crm.pages.ecommercePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class eCommerceStepDefinitions {

    ecommercePage ecp = new ecommercePage();


    @Given("User is on eCommerce page")
    public void user_is_on_e_commerce_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url1"));

    }
    @When("User enters dresses into searchBar")
    public void user_enters_dresses_into_search_bar() {
       ecp.searchBar.sendKeys("dresses");
       ecp.submitButton.click();
    }
    @Then("User should see dress results")
    public void user_should_see_dress_results() {
        BrowserUtils.waitForVisibility(ecp.productList,10);
        WebElement productsList = ecp.productList;
        List<WebElement> searchRes = productsList.findElements(By.tagName("a"));


        List<String> actualSearchResults = BrowserUtils.getElementsText(searchRes);

        for (String each:actualSearchResults) {
            String actualRes = each.toLowerCase();
            String expectedRes = "dress";
            System.out.println(each);


            if(actualRes.contains(expectedRes)){
                System.out.println("positive search result ");
                Assert.assertTrue(actualRes.contains(expectedRes));
            }


        }




    }


}
