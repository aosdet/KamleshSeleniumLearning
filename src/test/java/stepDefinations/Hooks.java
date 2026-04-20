package stepDefinations;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import core.ConfigManager;
import core.DriverFactory;
import core.DriverManager;
import core.ExtentManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

public class Hooks {

    //Good Framework
    //1.Well Strcutured
    //2. easily Maintanable
    //3. Highly Scalable
    //4. No Zig Zag
    //5. Simple Data Flow

    private static final Logger log = LogManager.getLogger(Hooks.class);
    public static ExtentReports extent = ExtentManager.getInstance();
    public static ExtentTest test;

    //Hooks
    // it run before each Scenario
    @Before
    public void setup(Scenario scenario) {

        test = extent.createTest(scenario.getName());
        DriverFactory.initDriver(ConfigManager.get("browser"));

    }

//    @AfterStep
//    public void takesScreenshotofEachStep(Scenario scenario) throws IOException {
//
//        File src = ((TakesScreenshot) DriverManager.getDriver())
//                .getScreenshotAs(OutputType.FILE);
//
//        String fileName = "image_" + System.currentTimeMillis() + ".png";
//
//        File dest = new File(System.getProperty("user.dir") + "//screesnhots//"+ fileName);
//
//        FileHandler.copy(src, dest);
//    }


    @After
    // it run after each scenaraio
    public void teardown(Scenario scenario) {

        WebDriver driver = DriverManager.getDriver();

        try {
            if (scenario.isFailed()) {

                String screenshot = ((TakesScreenshot) driver)
                        .getScreenshotAs(OutputType.BASE64);

                test.fail("Scenario Failed",
                        MediaEntityBuilder.createScreenCaptureFromBase64String(screenshot).build());

            } else {
                test.pass("Scenario Passed");
            }

        } catch (Exception e) {
            test.warning("Screenshot capture failed: " + e.getMessage());
        }

        // Quit driver
        driver.quit();


        // Flush report
        extent.flush();
    }

}
