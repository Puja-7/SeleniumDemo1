package RunnerVtiger;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "D:\\JavaProgramsEcllipseNew\\CucumberBDD1YouTube\\src\\main\\java\\Features\\VtigerLogin.feature" }, // feature file or folder name
glue = { "StepDefnitions" }
)
public class TestRunner extends AbstractTestNGCucumberTests{

}
