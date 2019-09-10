package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/Vasu/eclipse-workspace/FreeCrmBDDFramework/src/main/java/Features/Hooks.feature", // path of feature file
		glue={"stepDefinition"}, //step definition path
		format= {"pretty","html:test-outout"} ,// output report as html , json,xml
		dryRun=false, // we can check missing step definition
		strict=true,//fail execution if there is any pending definition or undefined
		monochrome=true //to displayed output in readable format
		
		//tags= {"~@Gmail" ,"~@Facebook"}
		
		)
public class TestRunner {

	
		
}
