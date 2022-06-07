package utility;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class Hook {
    private static WebDriver driver;

    @Before("@web")
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", System.getProperty("E:\\Misc\\chromedriver.exe"));
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Before("@appium")
    public void setUpAppium() throws MalformedURLException
    {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("platformName", "Android");
        cap.setCapability("deviceName", "Lucifer"); // set the device name before executing the scripts
        cap.setCapability("appPath", System.getProperty("src/test/resources/apk/ApiDemos-debug.apk")); //set the location of apk before executing the scripts
        cap.setCapability("appPackage","io.appium.android.apis");
        cap.setCapability("appActivity","io.appium.android.apis.ApiDemos");
        cap.setCapability("automationName","uiAutomator2");
        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @After("@appium")
    public void tearDown()
    {
        driver.quit();
    }

    public static WebDriver getDriver()
    {
        return driver;
    }
}
