package com.cydeo.stepDefinitions;

import com.cydeo.pages.WebTablesPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class WebTablesSteps {
    WebTablesPage pageDriver = new WebTablesPage();

    @Given("user is on page {string}")
    public void user_is_on_page(String string) {
        Driver.getDriver().get(string);
    }

    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String, String> crentials) {
        pageDriver.usernameBox.sendKeys(crentials.get("username"));
        pageDriver.passwordBox.sendKeys(crentials.get("password") + Keys.ENTER);
    }

    @Then("user should see url contains {string}")
    public void user_should_see_url_contains(String string) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith(string));
    }


    /*
    After here another second webtable scenario works
     */
    @Given("user is on the page {string}")
    public void user_is_on_the_page(String string) {
        Driver.getDriver().get(string);
    }

    @When("user clicks on months dropdown")
    public void user_clicks_on_months_dropdown() {
        pageDriver.monthSelect.click();

    }

    @Then("user should see the months belove")
    public void user_should_see_the_months_belove(List<String> expectedMonths) {
        Select select = new Select(pageDriver.monthSelect);
        List<WebElement> monthOptions = select.getOptions();
        List<String> actualMonths = new ArrayList<>();
        //ArrayList<String> actualMonths = new ArrayList<>(); This one also works

        for (WebElement month : monthOptions) {
            actualMonths.add(month.getText());
        }
        Assert.assertEquals(expectedMonths, actualMonths);
    }


}
