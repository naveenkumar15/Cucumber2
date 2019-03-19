package cucumberbase;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Gomathi\\eclipse-workspace\\cucumberbase\\src\\test\\resources\\Features",monochrome=true,strict=false,dryRun=false,glue="cucumberbase",plugin="html:target")
public class testRunner {

}
