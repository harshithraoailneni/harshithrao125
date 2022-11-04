package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features= {".\\src\\test\\java\\Features"},
glue="stepDefinition",
dryRun=false,
monochrome=true,
plugin= {"pretty" ,"json:target/JSONReports/report.json"}
)

public class AllRunners extends AbstractTestNGCucumberTests{

}
