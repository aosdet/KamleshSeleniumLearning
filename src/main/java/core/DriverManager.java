package core;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    // Encapsulation - getter and setter

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver driverInstance) {

        driver.set(driverInstance);
    }

}

// Parralel Testing
//same driver shared amongst all Test cases
//driver1 ---->Test Case1
//driver2 --->Test Case 2
// driver3----> Test Case 3