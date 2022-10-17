package com.cydeo.stepDefinitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before(value = "@admin", order=0)
    public void setupScenario(){
        System.out.println("=========== before every Scenario run===========");
    }
    @After
    public void teardownSecenario(Scenario scenario){
        if (scenario.isFailed()){
            byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenario.getName());
        }
        Driver.closeDriver();
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
