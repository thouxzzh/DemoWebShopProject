package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void openPage() {
        driver.get("https://demowebshop.tricentis.com/");
    }

    public static void setUpDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
