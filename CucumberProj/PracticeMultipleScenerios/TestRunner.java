
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/Test/demoqa",glue = "Test/demoqa")
public class TestRunner extends AbstractTestNGCucumberTests {

}
