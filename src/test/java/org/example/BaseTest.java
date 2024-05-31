package org.example;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected AndroidDriver<MobileElement> driver;

    public static final String CHROMEDRIVE_AUTODOWNLOAD = "appium:chromedriver_autodownload";
    public static final String UIAUTOMATOR2LAUNCHTIMEOUT = "appium:uiautomator2ServerLaunchTimeout";
    public static final String ANDROIDINSTALLTIMOUT="appium:androidInstallTimeout";


    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_API_29");
        caps.setCapability(MobileCapabilityType.APP,"C:/Users/lenovo/Downloads/com.fivemobile.thescore_20133_apps.evozi.com.apk");
        caps.setCapability("appPackage","com.fivemobile.thescore");
        caps.setCapability("appActivity","com.fivemobile.thescore.ui.MainActivity");
        //caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");  //IF accessing app from browser
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2"); //Android- XCUITest-iOS
        caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60000);
        caps.setCapability(CHROMEDRIVE_AUTODOWNLOAD,"true");
        caps.setCapability(UIAUTOMATOR2LAUNCHTIMEOUT,100000);
        caps.setCapability(ANDROIDINSTALLTIMOUT,100000);

        URL appiumServerURL = new URL("http://192.168.2.24:4723/wd/hub");
        driver = new AndroidDriver<>(appiumServerURL, caps);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
