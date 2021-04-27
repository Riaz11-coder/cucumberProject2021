package com.crm.step_definitions;

import com.crm.pages.uploadFilePage;
import com.crm.utilities.BrowserUtils;
import com.crm.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class uploadFileStepDefinitions {

    uploadFilePage ufp = new uploadFilePage();

    @When("User clicks the More tab")
    public void user_clicks_the_more_tab() {
        BrowserUtils.waitForVisibility(ufp.MoreTab,10);
        ufp.MoreTab.click();
    }
    @When("User selects the Appreciation module")
    public void user_selects_the_appreciation_module() {
        BrowserUtils.waitForVisibility(ufp.AppreciationTab,10);
        ufp.AppreciationTab.click();
    }
    @When("User clicks on Upload Files icon")
    public void user_clicks_on_upload_files_icon() {
       BrowserUtils.waitForVisibility(ufp.UploadfilesIcon,10);
       ufp.UploadfilesIcon.click();
    }
    @When("User selects the Upload files and images button")
    public void user_selects_the_upload_files_and_images_button() {
        BrowserUtils.waitForVisibility(ufp.Uploader,10);
        ufp.Uploader.click();
    }
    @When("User selects local file")
    public void user_selects_local_file() {
        ufp.UploadFile(ufp.File);
    }
    @When("User clicks the Send button")
    public void user_clicks_the_send_button() {
        BrowserUtils.waitFor(2);
        ufp.Submit.click();
    }
    @Then("User should see file appear in the Activity Stream")
    public void user_should_see_file_appear_in_the_activity_stream() {
        BrowserUtils.waitFor(2);
        System.out.println("Porsche photo displayed is : "+ufp.porschePic.isDisplayed());

        Assert.assertTrue(ufp.porschePic.isDisplayed());

    }



}
