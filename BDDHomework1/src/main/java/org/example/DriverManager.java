package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariOptions;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    MutableCapabilities sauceOptions = new MutableCapabilities();
    public String USERNAME = loadProp.getProperty("SAUCE_USERNAME");
    public String ACCESS_KEY = loadProp.getProperty("SAUCE_ACCESS_KEY");
    public String URL = "https://"+ USERNAME + ":" + ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com/wd/hub";
    public boolean SAUCE_LAB = Boolean.parseBoolean(System.getProperty("Sauce"));
//    public boolean SAUCE_LAB = false;

    //    public String browserName = loadProp.getProperty("Browser");
    public String browserName = System.getProperty("Browser");
//        public String browserName = "Chrome";



    public void openBrowser() {
        System.out.println(SAUCE_LAB);

        if (SAUCE_LAB) {
            System.out.println("Running in SauceLab.......... with browser " + browserName);

            if (browserName.equalsIgnoreCase("Chrome")) {
                ChromeOptions browserOptions = new ChromeOptions();
                browserOptions.setExperimentalOption("w3c", true);
                browserOptions.setCapability("platformName", System.getProperty("OS"));
                browserOptions.setCapability("browserVersion", "112");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }



            } else if (browserName.equalsIgnoreCase("FireFox")) {
                FirefoxOptions browserOptions = new FirefoxOptions();
                browserOptions.setPlatformName("Windows 10");
                browserOptions.setBrowserVersion("latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            } else if (browserName.equalsIgnoreCase("edge")) {
                EdgeOptions browserOptions = new EdgeOptions();
                browserOptions.setPlatformName("Windows 11");
                browserOptions.setBrowserVersion("latest");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }

            }else if (browserName.equalsIgnoreCase("Safari")) {

                SafariOptions browserOptions = new SafariOptions();
                browserOptions.setPlatformName("macOS 11.00");
                browserOptions.setBrowserVersion("14");
                browserOptions.setCapability("sauce:options", sauceOptions);
                try {
                    driver = new RemoteWebDriver(new URL(URL), browserOptions);
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }


            } else {
                System.out.println("Wrong browser name or empty: " + browserName);
            }



        } else {

            if (browserName.equalsIgnoreCase("Chrome")) {
                //Open Chrome browser
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--no-sandbox");
//                chromeOptions.addArguments("--headless");
//                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("disable-gpu");
                driver = new ChromeDriver(chromeOptions);

            } else if (browserName.equalsIgnoreCase("firefox")) {
                //Open Firefox browser
                driver = new FirefoxDriver();

            } else if (browserName.equalsIgnoreCase("edge")) {
                //Open Edge browser
                driver = new EdgeDriver();

            } else {
                System.out.println("Browser name is wrong or not implemented :" + browserName);
            }
        }


        //type the url
        driver.get(loadProp.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public void closeBrowser() {
        driver.close();
    }
}
