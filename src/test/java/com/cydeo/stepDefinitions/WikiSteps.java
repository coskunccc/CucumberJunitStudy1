package com.cydeo.stepDefinitions;

import com.cydeo.pages.WikiPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSteps {
    WikiPage pageDriver = new WikiPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String string) {
        pageDriver.searchBox.sendKeys(string);
    }

    @When("user clicks wiki search button")
    public void user_cliks_wiki_search_button() {
        pageDriver.searchButton.click();
    }

    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
       String actualTitle= Driver.getDriver().getTitle();
        Assert.assertTrue("Title doesnt contain searched item",actualTitle.contains(string));
    }

    @Then("user sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String string) {
        String actualHeader=pageDriver.header.getText();
        Assert.assertTrue("Header is not same with searched item",actualHeader.equals(string));
    }

    @Then("user sees {string} is in the image header")
    public void user_sees_is_in_the_image_header(String string) {
        String actualImageHeader=pageDriver.imageHeader.getText();
        Assert.assertTrue("Image header is not same with searched item",actualImageHeader.equals(string));
    }
}
