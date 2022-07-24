package com.obtaincare.UI.utils;

import com.obtaincare.UI.dataProviders.ConfigReader;

import org.openqa.selenium.WebDriver;

public class Driver {


    private Driver(){
        // Singleton pattern,    Приватный потому что мы не хотим иметь екзепляр данного класса

    }
    public static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver == null){
            switch (ConfigReader.getProperty("browser").toLowerCase()){
                default:
                    driver = ChromeWebDriver.loadChromeDriver();
                    break;
                case "firefox":
                    driver = FireFoxWebDriver.loadFirefox();
                    break;
                case "edge":
                    driver = EdgeWebDriver.loadEdgeDriver();

            }
        }
        return driver;
    }


    public static void closeDriver(){
        try {
            if(driver!=null){
                driver.close();
                driver.quit();
                driver = null;

            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
