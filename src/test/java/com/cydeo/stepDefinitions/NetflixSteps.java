package com.cydeo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class NetflixSteps {
    @Given("I like {string}")
    public void i_like(String string) {
        System.out.println("I like "+string);
    }
    @Given("I dont like {string}")
    public void i_dont_like(String string) {
        System.out.println("I dont like "+string);
    }

    @Given("I like")
    public void i_like(List<String> movieType) {
        System.out.println("I like movies "+movieType);
    }
    @Given("I like movies with type")
    public void i_like_movies_with_type(Map<String,String> movie) {
        System.out.println("I like the movie "+movie);
    }

    @When("I go homepage")
    public void i_go_homepage() {

    }
    @Then("I should see suggestions")
    public void i_should_see_suggestions() {

    }
}
