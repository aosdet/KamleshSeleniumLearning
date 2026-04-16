package runner;

// Github
// Step1 : Commit code
// Step2: Push Code to Remote Repository

// Testing Github


import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",   // path to feature files
        glue = "stepDefinations",                  // package for step defs
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        },
        dryRun = false,                            // true = check steps, false = run tests
        tags = "@regression"                            // run specific tagged scenarios
)
public class TestRunner extends AbstractTestNGCucumberTests {

}

// 10 sessions- 500 , 5000/-
//Extent Reports Done
// Maven Integration Done
// Git and Github
// Parallel execution
// Cross browser Testing
//Jenkins Pipeline CI/CD
//Headless Execution


// Maven --->pom.xml --->testng.xml --->TestRunner-->@Login


// mvn package -DskipTests  -- Test skip
// mvn clean
//mvn install
//mvn Test
