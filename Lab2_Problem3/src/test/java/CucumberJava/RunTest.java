package CucumberJava;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;
@Suite
@RunWith(Cucumber.class)
@Cucumber.Options(format = {"pretty", "html:target/cucumber"})
@SelectClasspathResource("feature")
public class RunTest { }
