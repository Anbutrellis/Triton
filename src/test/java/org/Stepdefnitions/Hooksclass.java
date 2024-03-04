package org.Stepdefnitions;

import java.io.IOException;

import org.Uttility.Baseclass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooksclass extends Baseclass {
	@After
	public static void Afterscenario(Scenario sc) throws IOException{
		
		Screenshot(sc.getName());
		
		if (sc.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            sc.attach(screenshot, "image/png", "Screenshot");
            
        }
		
		//BrowersQuit();

	}
	@Before
	public static void Beforescenario() {
		
		Browerlauch("firefox");
		
	}

}
