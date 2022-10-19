package RunnerActitme;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= {"D:\\JavaProgramsEcllipseNew\\CucumberBDD1YouTube\\src\\main\\java\\Features\\Gmail.feature"},
		glue= {"StepDefnitions"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty","html:test-output/gmailReport.html"}
		)
public class GmailRunner extends AbstractTestNGCucumberTests {

}
