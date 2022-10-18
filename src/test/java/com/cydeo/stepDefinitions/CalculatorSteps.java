package com.cydeo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CalculatorSteps {
    //
    int actualResult;
    @Given("calculator is open")
    public void calculator_is_open() {
        System.out.println("running from given");
    }
    @When("numbers {int} and {int} added")
    public void numbers_and_added(int int1, int int2) {
        actualResult=int1+int2;
        System.out.println("When I add "+int1+" with "+int2);
    }
    @Then("result should be {int}")
    public void result_should_be(int int1) {
        System.out.println("I should have "+int1);
        Assert.assertTrue(actualResult==int1);
    }
}
