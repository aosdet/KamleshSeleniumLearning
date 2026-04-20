package runner;

// Github
// Step1 : Commit code
// Step2: Push Code to Remote Repository

// Testing Github

// Team Member updated TestRunner

// git init --> to intiliase GIT into our Project
// git status --> to Track uncommitted Files or Modified Files
// git add -A ---> to add all the files before commit
// git commit -m "Message" ---> commit the code
// git push origin KamleshBranch

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",   // path to feature files
        glue = "stepDefinations",                  // package for step defs
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        },
        dryRun = false,                            // true = check steps, false = run tests
        tags = "@Validlogin"                            // run specific tagged scenarios
)
public class TestRunner extends AbstractTestNGCucumberTests {


        @Override
        @DataProvider(parallel = true)
        public Object[][] scenarios() {
                return super.scenarios();
        }

}

// 10 sessions- 500 , 5000/-
//Extent Reports Done
// Maven Integration Done
// Git and Github- Done


// Cross browser Testing-- using property File--Done
// Parallel execution  Done
// Cross browser Testing --using Maven  -- Kamlesh will try
//Jenkins Pipeline CI/CD
//Headless Execution  --Done
// How to Find Broken Link on any webpage? Done
// How to take screenshot of all the Steps?   Done


// Maven --->pom.xml --->testng.xml --->TestRunner-->@Login


// mvn package -DskipTests  -- Test skip
// mvn clean
//mvn install
//mvn Test
