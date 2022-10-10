package com.cydeo.stepDefinitions;

import com.cydeo.pages.SearchPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchSteps {
    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Then("user should see title is Google")
    public void user_should_see_title_is_google() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title is not Google", actualTitle.equals("Google"));
    }

    @When("user types apple and clicks enter key")
    public void user_types_apple_and_clicks_enter_key() {
        SearchPage searchDriver = new SearchPage();

        searchDriver.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user should see apple in title")
    public void user_should_see_apple_in_title() {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.equals("apple - Google'da Ara"));
    }

}
