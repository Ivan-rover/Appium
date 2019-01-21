import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class FirstTestiOS {

    private AppiumDriver driver;

    @Before

    public void setUp() throws Exception
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("platformName","iOS");
        capabilities.setCapability("deviceName","iphone Simulator");
        capabilities.setCapability("platformVersion","12.1");
        capabilities.setCapability("browserName", "Safari");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("bundleId","bundleId");
        capabilities.setCapability("startIWDP","true");


        //capabilities.setCapability("appPackage","org.wikipedia");
        //capabilities.setCapability("appActivity",".main.MainActivity");
        //capabilities.setCapability("app","/Users/webdev/IdeaProjects/JavaAppiunAutomation/apks/org.wikipedia.apk");



        driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

    }

    @After

    public void tearDown()
    {
    driver.quit();
    }

    @Test

    public void firstTest()
    {
        System.out.println("First test run");
    }
}
