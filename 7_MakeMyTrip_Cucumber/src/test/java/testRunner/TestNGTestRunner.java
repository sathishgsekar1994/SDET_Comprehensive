package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features = "D:\\SDET\\7_MakeMyTrip\\Features\\Trip.feature",
glue = "Stepdefinition",
dryRun=false,
monochrome=true,
plugin= {
		 "pretty","html:target/cucumber.html","json:target/cucumber.json","junit:target/cucumber.xml"
}
)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

}
