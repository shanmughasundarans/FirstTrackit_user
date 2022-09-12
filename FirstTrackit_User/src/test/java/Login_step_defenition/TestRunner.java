package Login_step_defenition;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
//Added Manually
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",glue= {"Login_step_defenition"},monochrome=true,tags= "@Smoke")
public class TestRunner {
	

}
