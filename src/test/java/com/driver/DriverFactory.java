package com.driver;

/* This is the Driver Factory which provides the driver object for browser mentioned in the config file*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.IOException;

public class DriverFactory {

    static WebDriver driver = null;

    // To create the browser instance
    static WebDriver createInstance(String browserName) throws IOException {

        if (browserName.toLowerCase().contains("firefox")) {
            driver = getFireFoxDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("chrome")) {
            driver = getChromeDriver();
            return driver;
        }
        if (browserName.toLowerCase().contains("local")) {
            driver = new FirefoxDriver();
            return driver;
        }
        return driver;
    }

    public static WebDriver getFireFoxDriver() {
        File pathToBinary = new File("/Applications/Firefox.app/Contents/MacOS/firefox");
        FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        WebDriver firefoxDriver = new FirefoxDriver(ffBinary, firefoxProfile);
        return firefoxDriver;
    }

    public static WebDriver getChromeDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/testDrivers/chromedriver");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        capabilities.setCapability("chrome.binary", "src/test/resources/testDrivers/chromedriver");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        WebDriver chromeDriver = new ChromeDriver(capabilities);
        return chromeDriver;
    }


}


