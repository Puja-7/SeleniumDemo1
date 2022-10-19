package RunnerActitme;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

@CucumberOptions(
		features= {"D:\\JavaProgramsEcllipseNew\\CucumberBDD1YouTube\\src\\main\\java\\Features\\ActTimeTaskCreation.feature"},
		glue= {"StepDefinitionActiTime"},
		//format= {"pretty","html:test-output"},
		monochrome=true,
		publish=true,
				plugin = {"pretty","html:test-output/actitimeReport.html","json:test-output/actTime.json" },
	snippets=SnippetType.UNDERSCORE,
		dryRun=false
		)
public class TestRunnerActitime extends AbstractTestNGCucumberTests{

}
