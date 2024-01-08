package com.B31G6_Sprint2_Fleet.step_definitions;

import com.B31G6_Sprint2_Fleet.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void teardownMethod(Scenario scenario){
        // we are using byte for syntax (documentation on how to take screenshot)
        // according to definition, the code is trying to get the screenshot of the current screen pixel by pixel,
        // and each pixel is being stored inside of each byte and this becomes together in the array of byte to become screenshot
         if(scenario.isFailed()){
             // this method just return true boolean value is scenario is failing
             byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
             scenario.attach(screenshot, "image/png", scenario.getName());
         }
        Driver.closeDriver();
    }
}
