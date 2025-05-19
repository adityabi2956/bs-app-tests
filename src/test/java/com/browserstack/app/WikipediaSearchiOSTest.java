package com.browserstack.app;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.URL;

public class WikipediaSearchiOSTest {

    private AppiumDriver driver;

    @BeforeClass
    public void setUp() throws Exception {
        String USERNAME = "";
        String ACCESS_KEY = "";

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserstack.user", USERNAME);
        caps.setCapability("browserstack.key", ACCESS_KEY);

        // Replace with your uploaded IPA app URL
        caps.setCapability("app", "bs://0e92d6ed49c240f47ec79391db5d2334baf6e7fb");

        // Device capabilities
        caps.setCapability("deviceName", "iPhone 14");
        caps.setCapability("os_version", "16");
        caps.setCapability("deviceName", "iPhone 14"); // required for W3C compliance

        // Metadata
        caps.setCapability("project", "Wikipedia iOS Test");
        caps.setCapability("build", "Build-iOS-1");
        caps.setCapability("name", "Wikipedia Search Test - iOS");

        // Appium-specific iOS config
        caps.setCapability("autoAcceptAlerts", true);

        // Initialize the driver
        String remoteUrl = "https://" + USERNAME + ":" + ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
        driver = new IOSDriver(new URL(remoteUrl), caps);
    }

    @Test
    public void searchForBrowserStack() throws InterruptedException {
        Thread.sleep(5000); // Wait for the app to load

        //WebElement searchElement = driver.findElement(AppiumBy.accessibilityId("Search Wikipedia"));
        //searchElement.click();

        //Thread.sleep(1000);

        //WebElement inputField = driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeSearchField'"));
        //inputField.sendKeys("BrowserStack");

        Thread.sleep(3000); // Allow search results to appear
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
