package learning.selenium.BroeknLink;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenLinkTest {

    @Test
    public void brokenlinkTest() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/#");

        List<WebElement> alLinks = driver.findElements(By.tagName("a"));
        System.out.println(alLinks.size());

        for (WebElement link : alLinks) {
            String url = link.getAttribute("href");

            if (url != null) {
                URL linkurl = new URL(url);
                HttpURLConnection httpURLConnection = (HttpURLConnection) linkurl.openConnection();
                int responsecode = httpURLConnection.getResponseCode();
                if (responsecode >= 400) {
                    System.out.println(url + " is broken link");
                }

            }


        }


    }
}
