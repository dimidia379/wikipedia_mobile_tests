package guru.qa.drivers;

import com.codeborne.selenide.WebDriverProvider;
import guru.qa.config.MobileConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    MobileConfig mobileConfig = ConfigFactory.create(MobileConfig.class, System.getProperties());
    String user = mobileConfig.user();
    String key = mobileConfig.key();
    String url = mobileConfig.url();

    public static URL getBrowserstackURL() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException();
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        // Set your access credentials
        desiredCapabilities.setCapability("browserstack.user", user);
        desiredCapabilities.setCapability("browserstack.key", key);

        // Set URL of the application under test
        desiredCapabilities.setCapability("app", url);

        // Specify device and os_version for testing
        desiredCapabilities.setCapability("device", "Google Pixel 3");
        desiredCapabilities.setCapability("os_version", "9.0");

        // Set other BrowserStack capabilities
        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "browserstack-build-1");
        desiredCapabilities.setCapability("name", "first_test");


        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        return new AndroidDriver(getBrowserstackURL(), desiredCapabilities);

    }
}
