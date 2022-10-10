package com.cydeo.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("Background running, user is on login page");
    }

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("librarian enters username");
    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("librarian enters password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {
        System.out.println("user sees dashboard");
    }

//user is  admin
    @When("user enters admin username")
    public void user_enters_admin_username() {
        System.out.println("admin enters username");
    }

    @When("user enters admin password")
    public void user_enters_admin_password() {
        System.out.println("admin enters password");
    }

    // user is student
    @When("user enters student username")
    public void user_enters_student_username() {
        System.out.println("student enters username");
    }
    @When("user enters student password")
    public void user_enters_student_password() {
        System.out.println("student enters password");
    }

}
