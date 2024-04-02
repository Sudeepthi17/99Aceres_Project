package runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
		features="Features",
		glue="stepdefinitions",
		//tags="@sanitytest",
		plugin={"pretty","html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:target/cucumberReports.json",
		"junit:target/cucumberReports.xml"
		})


public class runnerSample extends AbstractTestNGCucumberTests{

}
