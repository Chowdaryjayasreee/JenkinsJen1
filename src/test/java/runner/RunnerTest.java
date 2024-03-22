package runner;




import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
public class RunnerTest {
@RunWith(Cucumber.class)
 
@CucumberOptions(
		features = "Features",
		glue = "StepDefinition" )
 
public class HotelAppRunner {
}
}
 
