
package com.browserstack.app;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class WikipediaSearchTest {

    private AppiumDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities caps = new DesiredCapabilities();
        String USERNAME = "";
        String ACCESS_KEY = "";
        // Replace with your credentials
        //caps.setCapability("browserstack.user", USERNAME);
        //caps.setCapability("browserstack.key", ACCESS_KEY);

        // Uploaded app URL
        caps.setCapability("app", "bs://7bbb3459f57ea19e44bdaa02f3880355cf5dc7cf");

        // Device and OS
        caps.setCapability("deviceName", "Google Pixel 8");
caps.setCapability("os_version", "14.0");


        // Metadata
        caps.setCapability("project", "Wikipedia Android Test");
        caps.setCapability("build", "Build-1");
        caps.setCapability("name", "Wikipedia Search Test - Android");

        // Appium-specific
        caps.setCapability("autoGrantPermissions", true);

        // Init driver
        String remoteUrl = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
        driver = new AndroidDriver(new URL(remoteUrl), caps);
    }

    @Test
    public void searchForBrowserStack() throws InterruptedException {
        Thread.sleep(5000); // Wait for app to load
        //WebElement searchElement = driver.findElement(AppiumBy.accessibilityId("Search Wikipedia"));

        //searchElement.click();

        //Thread.sleep(1000);

        //WebElement inputField = driver.findElement(AppiumBy.id("org.wikipedia.alpha:id/search_src_text"));
        //inputField.sendKeys("BrowserStack");

        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
