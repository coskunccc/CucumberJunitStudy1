package com.cydeo.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
    @Before(value = "@admin", order=0)
    public void setupScenario(){
        System.out.println("=========== before every Scenario run===========");
    }
    @After ("@librarian")
    public void teardownSecenario(){
        System.out.println("---------- after every Scenario run-----------");
    }
    @AfterStep (value="@student", order=1)
    public void teardownAfterStep(){
        System.out.println(" ---------- after every STEP run--------");
    }
    @BeforeStep("@admin")
    public void setupBeforeStep(){
        System.out.println("=============running Before every STEP===========");
    }
}
