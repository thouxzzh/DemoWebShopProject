
package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HelperClass {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void loadProperties() {
        prop = new Properties();
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\thous\\git\\DemoWebShopProject\\com.DemoWebShopProject\\src\\test\\resources\\config.properties");
            prop.load(file);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void setUpDriver() {
        loadProperties();
        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else {
            throw new RuntimeException("Browser not supported");
        }

        driver.manage().window().maximize();
    }

    public static void openPage() {
        String url = prop.getProperty("url");
        driver.get(url);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

