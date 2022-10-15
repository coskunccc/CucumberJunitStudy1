package com.cydeo.stepDefinitions;

import com.cydeo.pages.WebTablesPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrderSteps {
    WebTablesPage pageDriver = new WebTablesPage();

    @Given("user is logged in an on order page")
    public void user_is_logged_in_an_on_order_page() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/");
        pageDriver.usernameBox.sendKeys("Test");
        pageDriver.passwordBox.sendKeys("Tester" + Keys.ENTER);
        pageDriver.orderButton.click();
    }

    @When("user selects product type {string}")
    public void userSelectsProductType(String string) {
        Select select=new Select(pageDriver.product);
        select.selectByVisibleText(string);
    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer int1) {
        //pageDriver.quantity.clear();
        pageDriver.quantity.sendKeys(Keys.BACK_SPACE);
        pageDriver.quantity.sendKeys(String.valueOf(int1));
    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        pageDriver.customerName.sendKeys(string);
    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        pageDriver.street.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        pageDriver.city.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        pageDriver.state.sendKeys(string);
    }

    @When("user enters zip {int}")
    public void user_enters_zip(Integer int1) {
        pageDriver.zipCode.sendKeys(String.valueOf(int1));
    }

    @When("user selects credic card {string}")
    public void user_selects_credic_card(String string) {
        for(WebElement card: pageDriver.cards){
            if (card.getText().equalsIgnoreCase(string)){
                card.click();}
        }
    }

    @When("user enters card number {string}")
    public void user_enters_card_number(String string) {
        pageDriver.cardNumber.sendKeys(String.valueOf(string));
    }

    @When("user enters expire date {string}")
    public void user_enters_expire_date(String string) {
        pageDriver.expDate.sendKeys(string);
    }

    @When("user clicks process order button")
    public void user_clicks_process_order_button() {
        pageDriver.processOrder.click();
    }

    @Then("user shoul see {string} in the first row of table")
    public void user_shoul_see_in_the_first_row_of_table(String string) {
        Assert.assertTrue(pageDriver.customerInTable.getText().equals(string));
    }


}
